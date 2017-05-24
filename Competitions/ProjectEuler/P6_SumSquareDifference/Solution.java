package HackerRank.Competitions.ProjectEuler.P6_SumSquareDifference;

import java.util.Scanner;

/**
 * Created by kaima on 5/23/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            long n = scan.nextLong();
            long sqSum = n % 2 == 0 ? (n + 1) * (n / 2) : n * ((n / 2) + 1); // Can also be more easily done with (n*(n+1))/2
            sqSum *= sqSum;
            long sumSq = (n * (n + 1) * (2 * n + 1)) / 6;

            System.out.println(Math.abs(sqSum - sumSq));
        }
    }
}
