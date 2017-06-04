package HackerRank.Algorithms.Implementation.MatrixLayerRotation;

import java.util.Scanner;

/**
 * Created by kaima on 6/3/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        int rot = scan.nextInt();
        int[][] arr = new int[m][n];

        m--;
        n--;

        for (int r = 0; r <= m; r++)
        {
            for (int c = 0; c <= n; c++)
            {
                int x = r < m - r ? r : m - r;
                int y = c < n - c ? c : n - c;
                int layer = x < y ? x : y;

                int maxR = m - layer;
                int maxC = n - layer;

                int p = ((maxR + maxC) * 2) - (layer * 4);

                int row = r;
                int col = c;
                for (int i = 0; i < rot % p; i++)
                {
                    if (col == layer && row < maxR)
                        row++;
                    else if (row == maxR && col < maxC)
                        col++;
                    else if (row > layer && col == maxC)
                        row--;
                    else if (row == layer && col > layer)
                        col--;
                }
                arr[row][col] = scan.nextInt();
            }
        }


        for(int i = 0; i <= m; i++)
        {
            for(int j = 0; j <= n; j++)
                System.out.print(arr[i][j] + " ");
            System.out.println();
        }
    }

    /* Fails test case 8 and 9.
    static int[] rotateElement(int row, int col, int tRow, int tCol, int rot)
    {
        int[] loc = new int[2];

        int layer = Math.min(Math.min(Math.min(tRow - row - 1, tCol - col - 1), row), col);
        //System.out.print(layer + " ");
        while(rot > 0)
        {
            if(col == layer && row < tRow - layer - 1)
            {
                if(tRow - layer - row - 1 >= rot)
                {
                    row += rot;
                    rot = 0;
                }
                else
                {
                    rot -= tRow - layer - row - 1;
                    row = tRow - layer - 1;
                }
            }
            else if(col == tCol - layer - 1 && row > layer)
            {
                if(row - layer >= rot)
                {
                    row -= rot;
                    rot = 0;
                }
                else
                {
                    rot -= row - layer;
                    row = layer;
                }
            }
            else if(row == layer)
            {
                if(col - layer >= rot)
                {
                    col -= rot;
                    rot = 0;
                }
                else
                {
                    rot -= col - layer;
                    col = layer;
                }
            }
            else
            {
                if(tCol - layer - col - 1 >= rot)
                {
                    col += rot;
                    rot = 0;
                }
                else
                {
                    rot -= tCol - layer - col - 1;
                    col = tCol - layer - 1;
                }
            }
        }
        loc[0] = row;
        loc[1] = col;

        return loc;
    }*/
}
