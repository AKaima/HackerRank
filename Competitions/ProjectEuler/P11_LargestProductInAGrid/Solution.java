package HackerRank.Competitions.ProjectEuler.P11_LargestProductInAGrid;

import java.util.Scanner;

/**
 * Created by kaima on 5/25/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int[][] grid = new int[20][20];
        for(int grid_i=0; grid_i < 20; grid_i++){
            for(int grid_j=0; grid_j < 20; grid_j++){
                grid[grid_i][grid_j] = in.nextInt();
            }
        }
        int max = 0;
        for(int i = 0; i < 20; i++)
        {
            for(int j = 0; j < 20; j++)
            {
                if(i < 17)
                {
                    int val = grid[i][j] * grid[i+1][j] * grid[i+2][j] * grid[i+3][j];
                    if(val > max)
                        max = val;
                }
                if(j < 17)
                {
                    int val = grid[i][j] * grid[i][j+1] * grid[i][j+2] * grid[i][j+3];
                    if(val > max)
                        max = val;
                }
                if(i < 17 && j < 17)
                {
                    int val = grid[i][j] * grid[i+1][j+1] * grid[i+2][j+2] * grid[i+3][j+3];
                    if(val > max)
                        max = val;
                }
                if(i > 2 && j < 17)
                {
                    int val = grid[i][j] * grid[i-1][j+1] * grid[i-2][j+2] * grid[i-3][j+3];
                    if(val > max)
                        max = val;
                }
            }
        }
        System.out.println(max);
    }
}
