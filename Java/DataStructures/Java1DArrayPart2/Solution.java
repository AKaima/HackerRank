package HackerRank.Java.DataStructures.Java1DArrayPart2;

import java.util.Scanner;

/**
 * Created by kaima on 6/7/17.
 */
public class Solution {
    public static boolean canWin(int leap, int[] game, int loc) {
        if(loc >= game.length)
            return true;
        if(loc < 0 || game[loc] != 0)
            return false;
        game[loc] = 1;

        return canWin(leap, game, loc + leap) || canWin(leap, game, loc + 1) || canWin(leap, game, loc - 1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q --> 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();

            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println((canWin(leap, game, 0)) ? "YES" : "NO" );
        }
        scan.close();
    }
}
