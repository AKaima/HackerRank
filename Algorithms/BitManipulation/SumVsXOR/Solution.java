package HackerRank.Algorithms.BitManipulation.SumVsXOR;

import java.util.Scanner;

/**
 * Created by kaima on 6/4/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long n = scan.nextLong();
        long numZero = 0;
        while(n > 0)
        {
            if ((n & 1) == 0)
                numZero++;
            n >>= 1;
        }
        System.out.println(1L << numZero);
    }
}
