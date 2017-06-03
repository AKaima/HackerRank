package HackerRank.Algorithms.Strings.TheLoveLetterMystery;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            String s = scan.next();
            int count = 0;
            for(int j = 0; j < s.length()/2; j++)
                count += Math.abs(s.charAt(j)-  s.charAt(s.length() - 1 - j));
            System.out.println(count);
        }
    }
}
