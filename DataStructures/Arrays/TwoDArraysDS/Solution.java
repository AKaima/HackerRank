package HackerRank.DataStructures.Arrays.TwoDArraysDS;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[6][6];
        int max = Integer.MIN_VALUE;
        for(int i = 0; i < 6; i++)
        {
            for(int j = 0; j < 6; j++)
            {
                arr[i][j] = scan.nextInt();
            }
        }
        for(int i = 1; i < 5; i++)
        {
            for(int j = 1; j < 5; j++)
            {
                max = Math.max(max, arr[i-1][j-1] + arr[i-1][j] + arr[i-1][j+1] + arr[i][j] + arr[i+1][j-1] + arr[i+1][j] + arr[i+1][j+1]);
            }
        }
        System.out.println(max);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
