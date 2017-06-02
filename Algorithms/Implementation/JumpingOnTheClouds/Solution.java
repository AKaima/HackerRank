package HackerRank.Algorithms.Implementation.JumpingOnTheClouds;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] c = new int[n];
        for(int i = 0; i < n; i++)
            c[i] = scan.nextInt();
        int cur = 0;
        int num = 0;
        while(cur < n - 1)
        {
            if(cur == n - 2 || c[cur + 2] == 0)
                cur += 2;
            else
                cur++;
            num++;
        }
        System.out.println(num);
    }
}
