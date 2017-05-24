package HackerRank.Competitions.ProjectEuler.P9_SpecialPythagoreanTriplet;

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
            int max = -1;
            int n = scan.nextInt();
            /*
               a + b + c = n
               a2 + b2 = c2

               a2 + b2 = (n - a - b)2
               a2 + b2 = n2 + (a + b)2 - 2n(a + b)
               0 = n2 + 2ab - 2an - 2bn
             */
            for(int a = 3; a < n / 3; a++)
            {
                int b = ((a * a) - ((a - n) * (a - n)))/(2 * (a - n));
                double val = Math.sqrt(a*a + b*b);
                if(val % 1 == 0)
                {
                    int c = (int)val;
                    if(a+b+c==n && a*b*c > max)
                        max = a*b*c;
                }
            }
            System.out.println(max);
        }
    }
}
