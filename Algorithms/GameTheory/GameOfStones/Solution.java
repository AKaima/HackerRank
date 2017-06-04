package HackerRank.Algorithms.GameTheory.GameOfStones;

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
            System.out.println(scan.nextInt() % 7 <= 1 ? "Second" : "First");
    }
}
