package HackerRank.Algorithms.Implementation.FlatlandSpaceStation;

import java.util.Scanner;

/**
 * Created by kaima on 5/31/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int max = Integer.MIN_VALUE;
        int last = Integer.MAX_VALUE;
        int first = Integer.MAX_VALUE;
        int[] arr = new int[n];
        for(int i = 0; i < m; i++)
            arr[scan.nextInt()] = 1;
        for(int i = 0; i < n; i++)
        {
            if(arr[i] == 1)
            {
                if(first == Integer.MAX_VALUE)
                    first = i;
                if(i - last > max)
                    max = i - last;
                last = i;
            }
        }
        System.out.println(Math.max(first, Math.max(max/2, n - last - 1)));
    }
}
