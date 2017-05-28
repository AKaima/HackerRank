package HackerRank.Algorithms.Strings.TwoTwo;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    static class Node{
        Node[] children = new Node[10];
        boolean fin = false;

        void add(String s)
        {
            if(s.length() == 0)
            {
                fin = true;
                return;
            }
            int cur = s.charAt(s.length() - 1) - 48; //48 represents 0.

            if(children[cur] == null)
                children[cur] = new Node();
            children[cur].add(s.substring(0, s.length() - 1));
        }
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        Node node = new Node();
        int t = scan.nextInt();
        BigInteger b = BigInteger.ONE;
        node.add(b.toString());
        for(int i = 0; i < 800; i++)
        {
            b = b.shiftLeft(1); //Bit shift to multiply by 2.
            node.add(b.toString());
        }
        for(int i = 0; i < t; i++)
        {
            String s = scan.next();
            int count = 0;
            for(int j = 0; j < s.length(); j++)
            {
                Node node2 = node.children[s.charAt(j) - 48];
                if(node2 == null)
                    continue;
                if(node2.fin)
                    count++;
                for(int k = 1; k < 241 && k <= j; k++) {
                    node2 = node2.children[s.charAt(j - k) - 48];
                    if(node2 == null)
                        break;
                    if(node2.fin)
                        count++;
                }
            }
            System.out.println(count);
        }
    }
}
