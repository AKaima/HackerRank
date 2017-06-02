package HackerRank.Algorithms.Implementation.ChocolateFeast;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i ++)
        {
            int n = scan.nextInt();
            int c = scan.nextInt();
            int m = scan.nextInt();
            int wrappers = n / c;
            int count = n / c;

            while(wrappers >= m)
            {
                count += wrappers / m;
                wrappers = wrappers % m + wrappers / m;
            }

            System.out.println(count);
        }
    }
}
