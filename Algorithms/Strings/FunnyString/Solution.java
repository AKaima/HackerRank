package HackerRank.Algorithms.Strings.FunnyString;

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
            char[] s = scan.next().toCharArray();
            boolean valid = true;
            for(int j = 0; j < s.length/2; j++)
            {
                if(Math.abs(s[j + 1] - s[j]) != Math.abs(s[s.length - 1 - j] - s[s.length - 2 - j]))
                {
                    valid = false;
                    break;
                }
            }
            System.out.println(valid ? "Funny" : "Not Funny");
        }
    }
}
