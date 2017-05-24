package HackerRank.Competitions.ProjectEuler.P4_LargestPalindromeProduct;

import java.util.Scanner;

/**
 * Created by kaima on 5/23/17.
 */

//Relatively slow. Can be easily optimized. May revisit after solving more.
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int max = scan.nextInt();
            int maxPossible = 0;

            for(int j = 100; j <= 999; j++)
            {
                for(int k = 100; k <= j; k++)
                {
                    if(k * j >= max)
                        break;
                    StringBuilder sb = new StringBuilder();
                    sb.append(k * j);
                    if(sb.toString().equals(sb.reverse().toString()))
                        if(k * j > maxPossible)
                        {
                            maxPossible = k * j;
                        }
                }
            }

            System.out.println(maxPossible);
        }
    }
}
