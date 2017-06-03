package HackerRank.Algorithms.Strings.TwoCharacters;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String s = scan.next();
        char[][] alpha = new char[26][26];
        int[] count = new int[26];

        for(int i = 0; i < n; i++)
            count[s.charAt(i) - 97]++;

        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < 26; j++)
            {
                if(alpha[s.charAt(i) - 97][j] != s.charAt(i) && alpha[s.charAt(i) - 97][j] != 'X')
                    alpha[s.charAt(i) - 97][j] = s.charAt(i);
                else
                    alpha[s.charAt(i) - 97][j] = 'X';
                if(alpha[j][s.charAt(i) - 97] != s.charAt(i) && alpha[j][s.charAt(i) - 97] != 'X')
                    alpha[j][s.charAt(i) - 97] = s.charAt(i);
                else
                    alpha[j][s.charAt(i) - 97] = 'X';
            }
        }

        int max = 0;
        for(int i = 0; i < 26; i++)
            for(int j = 0; j < 26; j++)
                if(alpha[i][j] != 'X' && count[i] + count[j] > max)
                    max = count[i] + count[j];

        System.out.println(max == 1 ? 0 : max);
    }
}
