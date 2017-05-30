package HackerRank.Algorithms.Implementation.RepeatedString;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        long n = scan.nextLong();
        long count = 0;
        long subCount = 0;

        for(int i = 0; i < s.length(); i++)
            if(s.charAt(i) == 'a')
                subCount++;

        count += n / s.length() * subCount;

        long r = n % s.length();

        for(int i = 0; i < r; i++)
            if(s.charAt(i) == 'a')
                count++;

        System.out.println(count);
    }
}
