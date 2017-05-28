package HackerRank.Algorithms.Implementation.FormingAMagicSquare;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][][] combos = {
                {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},
                {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},
                {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},
                {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},
                {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},
                {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},
                {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},
                {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},
        };

        int[][] s = new int[3][3];
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                s[i][j] = scan.nextInt();

        int min = Integer.MAX_VALUE;
        for (int i = 0; i < 8; i++)
        {
            int cost = 0;
            for (int j = 0; j < 3; j++)
                for (int k = 0; k < 3; k++)
                    cost += Math.abs(s[j][k] - combos[i][j][k]);
            min = Math.min(min, cost);
        }
        System.out.println(min);
    }
}
