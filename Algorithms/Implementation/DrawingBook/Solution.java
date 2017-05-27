package HackerRank.Algorithms.Implementation.DrawingBook;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();

        System.out.println(Math.min(p / 2, (n/2)-(p/2)));
    }
}
