package HackerRank.Algorithms.Implementation.FindDigits;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            int count = 0;
            String s = "" + n;
            for(int j = 0; j < s.length(); j++)
                if(Integer.parseInt(s.substring(j, j + 1)) != 0 && n % Integer.parseInt(s.substring(j, j + 1)) == 0)
                    count++;
            System.out.println(count);
        }
    }
}
