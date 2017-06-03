package HackerRank.Algorithms.Strings.CaesarCipher;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] s = scan.next().toCharArray();
        int k = scan.nextInt();

        for(int i = 0; i < n; i++)
        {
            if(s[i] > 64 && s[i] < 91)
                s[i] = (char)((s[i] + k - 65) % 26 + 65);
            else if(s[i] > 96 && s[i] < 123)
                s[i] = (char)((s[i] + k - 97) % 26 + 97);
        }

        System.out.println(new String(s));
    }
}
