package HackerRank.Algorithms.Implementation.ManasaAndStones;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            int one = scan.nextInt();
            int two = scan.nextInt();
            int a = Math.min(one, two);
            int b = Math.max(one, two);

            if(a == b)
                System.out.print((n-1) * a);
            else
                for(int j = 0; j < n; j++)
                    System.out.print((((n-1-j) * a) + (j * b)) + " ");
            System.out.println();
        }
    }
}
