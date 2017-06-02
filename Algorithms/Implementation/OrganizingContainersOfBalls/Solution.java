package HackerRank.Algorithms.Implementation.OrganizingContainersOfBalls;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i = 0; i < q; i++)
        {
            int n = scan.nextInt();
            int[] a1 = new int[n];
            int[] a2 = new int[n];
            for(int j = 0; j < n; j++)
            {
                for(int k = 0; k < n; k++)
                {
                    int x = scan.nextInt();
                    a1[j] += x;
                    a2[k] += x;
                }
            }
            Arrays.sort(a1);
            Arrays.sort(a2);
            System.out.println(Arrays.equals(a1, a2) ? "Possible" : "Impossible");
        }
    }
}
