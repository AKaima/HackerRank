package HackerRank.Algorithms.Implementation.ViralAdvertising;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int num = 5;
        for(int i = 0; i < n; i++)
        {
            count += num / 2;
            num = (num / 2) * 3;
        }
        System.out.println(count);
    }
}
