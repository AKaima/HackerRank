package HackerRank.Algorithms.Implementation.SaveThePrisoner;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            int s = scan.nextInt();
            System.out.println(((s + m - 2) % n) + 1);
        }
    }
}
