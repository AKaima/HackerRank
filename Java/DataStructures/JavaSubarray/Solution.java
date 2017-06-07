package HackerRank.Java.DataStructures.JavaSubarray;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int total = 0, sum = 0, oldSum;
        int[] arr = new int[n];


        for(int i = 0; i < n; i++)
        {
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        for(int i = 0; i < n; i++)
        {
            oldSum = sum;
            if(sum < 0)
                total++;
            for(int j = n - 1; j > i; j--)
            {
                sum -= arr[j];
                if(sum < 0)
                    total++;
            }
            sum = oldSum - arr[i];
        }
        System.out.println(total);
    }
}
