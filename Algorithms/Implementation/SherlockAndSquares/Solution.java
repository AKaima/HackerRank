package HackerRank.Algorithms.Implementation.SherlockAndSquares;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            System.out.println((int)Math.sqrt(b) - (int)Math.ceil(Math.sqrt(a)) + 1);
        }
    }
}
