package HackerRank.Competitions.ProjectEuler.P7_10001stPrime;

import java.util.Scanner;

/**
 * Created by kaima on 5/23/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        long[] primes = new long[10000];
        primes[0] = 2;
        int num = 1;
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            if(n <= num)
                System.out.println(primes[n - 1]);
            else
            {
                long next = primes[num - 1] + 1;
                while(num < n)
                {
                    for(int j = 0; j < num; j++)
                    {
                        while(next % primes[j] == 0)
                        {
                            next++;
                            j = 0;
                        }
                    }
                    primes[num] = next;
                    num++;
                    next++;
                }
                System.out.println(primes[n - 1]);
            }
        }
    }
}
