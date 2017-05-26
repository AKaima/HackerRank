package HackerRank.Algorithms.Greedy.MinimumAbsoluteDifferenceInAnArray;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        Arrays.sort(arr);
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n - 1; i++)
        {
            int val = Math.abs(arr[i] - arr[i+1]);
            if(val < min)
                min = val;
        }
        System.out.println(min);
    }
}
