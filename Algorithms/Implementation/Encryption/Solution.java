package HackerRank.Algorithms.Implementation.Encryption;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();

        int r = (int)Math.sqrt(s.length());
        int c = (s.length() > r * r) ? r + 1 : r;
        r = (s.length() > r * c) ? r + 1 : r;

        for(int i = 0; i < c; i++)
        {
            for(int j = 0; j < r; j++)
                if(i + j * c < s.length())
                    System.out.print(s.charAt(i + j * c));
            System.out.print(" ");
        }
    }
}
