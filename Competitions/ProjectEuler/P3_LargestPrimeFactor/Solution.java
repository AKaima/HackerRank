package HackerRank.Competitions.ProjectEuler.P3_LargestPrimeFactor;

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

            while(n % 2 == 0)
                n /= 2;

            if(n == 1)
                System.out.println(2);
            else
            {
                int j = 3;

                for(; j <= Math.sqrt(n); j += 2)
                    while(n % j == 0)
                        n /= j;

                System.out.println(n > 2 ? n : j - 2);
            }
        }
    }
}
