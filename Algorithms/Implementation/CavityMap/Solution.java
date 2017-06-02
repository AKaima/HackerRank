package HackerRank.Algorithms.Implementation.CavityMap;

import java.util.Scanner;

/**
 * Created by kaima on 5/31/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[][] arr = new char[n][n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.next().toCharArray();
        for(int i = 0; i < n; i++)
        {
            for(int j = 0; j < n; j++)
            {
                if(i > 0 && i < n - 1 && j > 0 && j < n-1 && arr[i][j] > arr[i-1][j] && arr[i][j] > arr[i + 1][j] && arr[i][j] > arr[i][j-1] && arr[i][j] > arr[i][j+1])
                    arr[i][j] = 'X';
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}
