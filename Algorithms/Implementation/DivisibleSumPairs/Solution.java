package HackerRank.Algorithms.Implementation.DivisibleSumPairs;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
        }

        for(int i = 0; i < n - 1; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                if((arr[i] + arr[j]) % k == 0)
                    count++;
            }
        }

        System.out.println(count);
    }
}
