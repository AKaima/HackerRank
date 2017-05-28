package HackerRank.Algorithms.Implementation.PickingNumbers;

import java.util.Scanner;

/**
 * Created by kaima on 5/27/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[101];
        for(int i = 0; i < n; i++)
            arr[scan.nextInt()]++;
        int max = 0;
        for(int i = 1; i < n; i++)
            if(arr[i - 1] + arr[i] > max)
                max = arr[i - 1] + arr[i];
        System.out.println(max);
    }
}
