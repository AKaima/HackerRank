package HackerRank.Java.Advanced.JavaVisitorPattern;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kaima on 6/7/17.
 */
enum Color {
    RED, GREEN
}

abstract class Tree {

    private int value;
    private Color color;
    private int depth;

    public Tree(int value, Color color, int depth) {
        this.value = value;
        this.color = color;
        this.depth = depth;
    }

    public int getValue() {
        return value;
    }

    public Color getColor() {
        return color;
    }

    public int getDepth() {
        return depth;
    }

    public abstract void accept(TreeVis visitor);
}

class TreeNode extends Tree {

    private ArrayList<Tree> children = new ArrayList<>();

    public TreeNode(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitNode(this);

        for (Tree child : children) {
            child.accept(visitor);
        }
    }

    public void addChild(Tree child) {
        children.add(child);
    }
}

class TreeLeaf extends Tree {

    public TreeLeaf(int value, Color color, int depth) {
        super(value, color, depth);
    }

    public void accept(TreeVis visitor) {
        visitor.visitLeaf(this);
    }
}

abstract class TreeVis
{
    public abstract int getResult();
    public abstract void visitNode(TreeNode node);
    public abstract void visitLeaf(TreeLeaf leaf);

}

class SumInLeavesVisitor extends TreeVis {
    int result = 0;
    public int getResult() {
        return result;
    }

    public void visitNode(TreeNode node) {

    }

    public void visitLeaf(TreeLeaf leaf) {
        result += leaf.getValue();
    }
}

class ProductOfRedNodesVisitor extends TreeVis {
    long result = 1;

    public int getResult() {
        return (int)result;
    }

    public void visitNode(TreeNode node) {
        if(node.getColor().equals(Color.RED)) {
            result = (result * node.getValue()) % 1000000007;
        }
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.RED)) {
            result = (result * leaf.getValue()) % 1000000007;
        }
    }
}

class FancyVisitor extends TreeVis {
    int evenSum = 0;
    int greenSum = 0;

    public int getResult() {
        return Math.abs(evenSum - greenSum);
    }

    public void visitNode(TreeNode node) {
        if(node.getDepth() % 2 == 0)
            evenSum += node.getValue();
    }

    public void visitLeaf(TreeLeaf leaf) {
        if(leaf.getColor().equals(Color.GREEN))
            greenSum += leaf.getValue();
    }
}

public class Solution {
    private static int[] vals;
    private static Color[] colors;
    private static HashMap<Integer, HashSet<Integer>> map;

    public static Tree solve() {
        Scanner scan = new Scanner(System.in);
        int numNodes = scan.nextInt();

        vals = new int[numNodes];
        colors = new Color[numNodes];
        map = new HashMap<>(numNodes);

        for (int i = 0; i < numNodes; i++)
            vals[i] = scan.nextInt();
        for (int i = 0; i < numNodes; i++)
            colors[i] = scan.nextInt() == 0 ? Color.RED : Color.GREEN;

        for (int i = 0; i < numNodes - 1; i++) {
            int u = scan.nextInt();
            int v = scan.nextInt();

            HashSet<Integer> byU = map.get(u);
            if (byU == null) {
                byU = new HashSet<>();
                map.put(u, byU);
            }
            byU.add(v);

            HashSet<Integer> byV = map.get(v);
            if (byV == null) {
                byV = new HashSet<>();
                map.put(v, byV);
            }
            byV.add(u);
        }

        if (numNodes == 1)
            return new TreeLeaf(vals[0], colors[0], 0);

        TreeNode root = new TreeNode(vals[0], colors[0], 0);
        addChildren(root, 1);

        return root;
    }


    private static void addChildren(TreeNode parent, Integer parentNum) {
        for(Integer treeNum : map.get(parentNum)) {
            map.get(treeNum).remove(parentNum);

            HashSet<Integer> grandChildren = map.get(treeNum);
            Tree tree;

            if (grandChildren != null && !grandChildren.isEmpty())
                tree = new TreeNode(vals[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);
            else
                tree = new TreeLeaf(vals[treeNum - 1], colors[treeNum - 1], parent.getDepth() + 1);

            parent.addChild(tree);

            if (tree instanceof TreeNode) {
                addChildren((TreeNode) tree, treeNum);
            }
        }
    }


    public static void main(String[] args) {
        Tree root = solve();
        SumInLeavesVisitor vis1 = new SumInLeavesVisitor();
        ProductOfRedNodesVisitor vis2 = new ProductOfRedNodesVisitor();
        FancyVisitor vis3 = new FancyVisitor();

        root.accept(vis1);
        root.accept(vis2);
        root.accept(vis3);

        int res1 = vis1.getResult();
        int res2 = vis2.getResult();
        int res3 = vis3.getResult();

        System.out.println(res1);
        System.out.println(res2);
        System.out.println(res3);
    }
}