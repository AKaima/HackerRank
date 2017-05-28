package HackerRank.Algorithms.Implementation.UtopianTree;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution { //Can also be solved mathematically with ((int) Math.pow(2, (n + 3) / 2)) + (((int) Math.pow(-1, n)) - 3) / 2
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        int[] h = new int[61];
        h[0] = 1;
        int count = 1;
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            if(n >= count)
            {
                for(int j = count; j <= n; j += 2)
                {
                    h[j] = h[j - 1] * 2;
                    h[j + 1] = h[j] + 1;
                    count += 2;
                }
            }
            System.out.println(h[n]);
        }
    }
}
