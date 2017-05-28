package HackerRank.Algorithms.Implementation.CircularArrayRotation;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int q = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        for(int i = 0; i < q; i++)
            System.out.println(arr[(scan.nextInt() + n - k % n) % n]);
    }
}
