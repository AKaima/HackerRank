package HackerRank.Algorithms.Implementation.AngryProfessor;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int n = scan.nextInt();
            int k = scan.nextInt();
            int count = 0;
            for(int j = 0; j < n; j++)
                if(scan.nextInt() <= 0)
                    count++;
            System.out.println(count >= k ? "NO" : "YES");
        }
    }
}
