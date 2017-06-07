package HackerRank.Java.DataStructures.JavaBitSet;

import java.util.BitSet;
import java.util.Scanner;

/**
 * Created by kaima on 6/7/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BitSet b1 = new BitSet(n);
        BitSet b2 = new BitSet(n);

        for(int i = 0; i < m; i++)
        {
            String query = scan.next();
            int v1 = scan.nextInt();
            int v2 = scan.nextInt();
            switch(query){
                case "AND":
                    if(v1 == 1)
                        b1.and(b2);
                    else
                        b2.and(b1);
                    break;
                case "OR":
                    if(v1 == 1)
                        b1.or(b2);
                    else
                        b2.or(b1);
                    break;
                case "XOR":
                    if(v1 == 1)
                        b1.xor(b2);
                    else
                        b2.xor(b1);
                    break;
                case "FLIP":
                    if(v1 == 1)
                        b1.flip(v2);
                    else
                        b2.flip(v2);
                    break;
                case "SET":
                    if(v1 == 1)
                        b1.set(v2);
                    else
                        b2.set(v2);
                    break;
            }
            System.out.println(b1.cardinality() + " " + b2.cardinality());
        }
    }
}
