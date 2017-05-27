package HackerRank.Algorithms.Implementation.TheHurdleRace;

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
        int max = 0;
        for(int i = 0; i < n; i++)
        {
            int val = scan.nextInt();
            if(val > max)
                max = val;
        }
        System.out.println(Math.max(max - k, 0));
    }
}
