package HackerRank.Algorithms.Search.SherlockAndArray;

import java.util.Scanner;

/**
 * Created by kaima on 5/27/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            int[] arr = new int[n];
            int left = 0;
            int right = 0;
            for(int j = 0; j < n; j++)
            {
                arr[j] = scan.nextInt();
                right += arr[j];
            }
            if(left != right)
            {
                right -= arr[0];
                for(int j = 1; j < n; j++)
                {
                    if(left == right)
                        break;
                    left += arr[j - 1];
                    right -= arr[j];
                }
            }
            System.out.println(left == right ? "YES" : "NO");
        }
    }
}
