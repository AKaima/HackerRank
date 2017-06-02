package HackerRank.Algorithms.Implementation.TaumAndBday;

import java.util.Scanner;

/**
 * Created by kaima on 5/29/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            long b = scan.nextInt();
            long w = scan.nextInt();
            long x = scan.nextInt();
            long y = scan.nextInt();
            long z = scan.nextInt();
            x = Math.min(x, y + z);
            y = Math.min(y, x + z);
            System.out.println(b * x + y * w);
        }
    }
}
