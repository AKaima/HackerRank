package HackerRank.DataStructures.Stacks.MaximumElement;

import java.util.Scanner;
import java.util.Stack;

/**
 * Created by kaima on 5/18/17.
 */
public class Solution {
    private static class Node {
        int val;
        int curMax;
        public Node(int val, int curMax) {
            this.val = val;
            this.curMax = curMax;
        }
    }

    public static void main(String[] args) {
        Stack<Node> s = new Stack<Node>();
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
        {
            int q = scan.nextInt();
            switch(q){
                case 1:
                    int val = scan.nextInt();
                    max = Math.max(max, val);
                    s.push(new Node(val, max));
                    break;
                case 2:
                    s.pop();
                    if(s.isEmpty())
                        max = Integer.MIN_VALUE;
                    else
                        max = s.peek().curMax;
                    break;
                case 3:
                    System.out.println(max);
                    break;
                default:
                    System.out.println(max);
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
