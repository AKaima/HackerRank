package HackerRank.Competitions.ProjectEuler.P10_SummationOfPrimes;

import java.util.Scanner;

/**
 * Created by kaima on 5/23/17.
 */
public class Solution { //Very unoptimized for both time and space. Should definitely fix setUp for when test cases are small.
    static boolean prime[] = new boolean[1000000];
    static long sums[] = new long[1000000];
    static int maxSummed = 2;

    static void setUp()
    {
        for(int i = 0; i < 1000000; i++)
            prime[i] = true;

        for(int i = 2; i * i < 1000000; i++)
            if(prime[i] == true)
                for(int j = i * 2; j < 1000000; j += i)
                    prime[j] = false;
    }

    static long modifiedSieve(int n)
    {
        if(n < maxSummed)
            return sums[n];

        long sum = sums[maxSummed - 1];

        for(int i = maxSummed; i <= n; i++)
        {
            if(prime[i] == true)
                sum += i;
            sums[i] = sum;
        }
        if(n > maxSummed)
            maxSummed = n;

        return sum;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        setUp();
        for(int i = 0; i < t; i++)
            System.out.println(modifiedSieve(scan.nextInt()));
    }
}
