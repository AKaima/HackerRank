package HackerRank.Algorithms.Greedy.GreedyFlorist;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int cost = 0;
        int[] flowers = new int[n];
        for(int i = 0; i < n; i++)
            flowers[i] = scan.nextInt();
        Arrays.sort(flowers);
        for(int i = n - 1; i > -1; i--)
            cost += flowers[i] * (((n - 1) - i)/k + 1);
        System.out.println(cost);
    }
}
