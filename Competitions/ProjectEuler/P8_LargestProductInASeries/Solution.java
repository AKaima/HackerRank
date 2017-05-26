package HackerRank.Competitions.ProjectEuler.P8_LargestProductInASeries;

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
            int n = scan.nextInt();
            int k = scan.nextInt();
            String s = scan.next();

            long max = 0;
            for(int j = 0; j < n - k; j++)
            {
                long prod = 1;
                for(int ind = j; ind < j + k; ind++)
                    prod *= Long.parseLong(s.substring(ind, ind + 1));
                if(prod > max)
                    max = prod;
            }
            System.out.println(max);
        }
    }
}
