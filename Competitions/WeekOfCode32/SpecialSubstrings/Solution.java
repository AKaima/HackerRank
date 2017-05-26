package HackerRank.Competitions.WeekOfCode32.SpecialSubstrings;

/**
 * Created by kaima on 5/21/17.
 */
import java.io.*;
import java.util.*;

public class Solution {
    static HashSet<String> newPals(String s, HashSet<String> old) {
        HashSet<String> hs = new HashSet<String>();
        hs.addAll(old);

        for(int i = 0; i < s.length(); i++)
        {
            boolean isPal = true;
            int j = i;
            int h = s.length() - 1;
            while(h > j)
            {
                if(s.charAt(j++) != s.charAt(h--))
                {
                    isPal = false;
                    break;
                }
            }
            if(isPal)
                hs.add(s.substring(i));
        }

        return hs;
    }


    static int[] propertyOfString(String s) {
        int[] res = new int[s.length()];
        HashSet<String> old1 = new HashSet<String>();
        HashSet<String> old2 = new HashSet<String>();
        for (int i = 0; i < s.length(); i++) {
            SplayBST<String, String> st = new SplayBST<String, String>();
            int count = 0;
            String s1 = s.substring(0, i + 1);
            HashSet<String> hs1 = newPals(s1, old1);
            HashSet<String> hs2 = new HashSet<String>();
            hs2.addAll(old2);
            HashSet<String> temp = new HashSet<String>();
            temp.addAll(hs1);
            hs1.removeAll(old1);
            for (String str : hs1) {
                if (count == 0 || !st.contains(str)) {
                    count++;
                    for (int j = 0; j < str.length(); j++) {
                        hs2.add(str.substring(0, j + 1));
                        st.put(str.substring(0, j + 1), str.substring(0, j + 1));
                    }
                }
            }
            old1 = new HashSet<String>();
            old1.addAll(temp);
            old2 = new HashSet<String>();
            old2.addAll(hs2);
            res[i] = hs2.size();
        }
        return res;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String s = br.readLine();
        int[] result = propertyOfString(s);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? "\n" : ""));
        }
        System.out.println("");
    }
}

class SplayBST<Key extends Comparable<Key>, Value>  {
    public Node root;

    private class Node {
        private Key key;
        private Value value;
        private Node left, right;

        public Node(Key key, Value value) {
            this.key   = key;
            this.value = value;
        }
    }

    public boolean contains(Key key) {
        return get(key) != null;
    }

    public Value get(Key key) {
        root = splay(root, key);
        int cmp = key.compareTo(root.key);
        if (cmp == 0) return root.value;
        else          return null;
    }

    public void put(Key key, Value value) {
        if (root == null) {
            root = new Node(key, value);
            return;
        }

        root = splay(root, key);

        int cmp = key.compareTo(root.key);

        if (cmp < 0) {
            Node n = new Node(key, value);
            n.left = root.left;
            n.right = root;
            root.left = null;
            root = n;
        }
        else if (cmp > 0) {
            Node n = new Node(key, value);
            n.right = root.right;
            n.left = root;
            root.right = null;
            root = n;
        }
        else {
            root.value = value;
        }

    }

    private Node splay(Node h, Key key) {
        if (h == null) return null;

        int cmp1 = key.compareTo(h.key);

        if (cmp1 < 0) {
            if (h.left == null) {
                return h;
            }
            int cmp2 = key.compareTo(h.left.key);
            if (cmp2 < 0) {
                h.left.left = splay(h.left.left, key);
                h = rotateRight(h);
            }
            else if (cmp2 > 0) {
                h.left.right = splay(h.left.right, key);
                if (h.left.right != null)
                    h.left = rotateLeft(h.left);
            }

            if (h.left == null) return h;
            else                return rotateRight(h);
        }

        else if (cmp1 > 0) {
            if (h.right == null) {
                return h;
            }

            int cmp2 = key.compareTo(h.right.key);
            if (cmp2 < 0) {
                h.right.left  = splay(h.right.left, key);
                if (h.right.left != null)
                    h.right = rotateRight(h.right);
            }
            else if (cmp2 > 0) {
                h.right.right = splay(h.right.right, key);
                h = rotateLeft(h);
            }

            if (h.right == null) return h;
            else                 return rotateLeft(h);
        }

        else return h;
    }

    private Node rotateRight(Node h) {
        Node x = h.left;
        h.left = x.right;
        x.right = h;
        return x;
    }

    private Node rotateLeft(Node h) {
        Node x = h.right;
        h.right = x.left;
        x.left = h;
        return x;
    }

    public int size() {
        return size(root);
    }

    private int size(Node x) {
        if (x == null) return 0;
        else return 1 + size(x.left) + size(x.right);
    }
}
