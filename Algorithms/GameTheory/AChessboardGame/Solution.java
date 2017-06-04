package HackerRank.Algorithms.GameTheory.AChessboardGame;

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
        {
            int x = scan.nextInt() % 4;
            int y = scan.nextInt() % 4;
            System.out.println(((y == 0) || (y == 3) || (x == 0) || (x == 3)) ? "First" : "Second");
        }
    }
}
