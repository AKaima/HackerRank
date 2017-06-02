package HackerRank.Algorithms.Implementation.StrangeCounter;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long t = scan.nextLong();
        long i = 2;
        while (3 * (i - 1) < t)
            i *= 2;
        System.out.println(3 * (i - 1) - t + 1);
    }
}
