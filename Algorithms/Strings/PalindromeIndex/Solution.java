package HackerRank.Algorithms.Strings.PalindromeIndex;

import java.util.Scanner;

/**
 * Created by kaima on 6/4/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            String s = scan.next();
            StringBuilder sb = new StringBuilder(s);
            sb.reverse();
            int val = -1;
            for(int j = 0; j < s.length()/2; j++)
            {
                if(!(s.charAt(j) == sb.charAt(j)))
                {
                    if(s.charAt(j + 1) == sb.charAt(j) && s.charAt(j + 2) == sb.charAt(j + 1))
                        val = j;
                    else if(s.charAt(j) == sb.charAt(j + 1))
                        val = s.length() - 1 - j;
                    break;
                }
            }
            System.out.println(val);
        }
    }
}
