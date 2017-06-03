package HackerRank.Algorithms.Search.IceCreamParlor;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int m = scan.nextInt();
            int n = scan.nextInt();
            int[] f = new int[n];
            for(int j = 0; j < n; j++)
                f[j] = scan.nextInt();
            outer:
            for(int j = 0; j < f.length; j++)
            {
                for(int k = f.length - 1; k > j; k--)
                {
                    if(f[j] + f[k] == m)
                    {
                        System.out.println((j + 1) + " " + (k + 1));
                        break outer;
                    }
                }
            }
        }
    }
}
