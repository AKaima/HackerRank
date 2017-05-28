package HackerRank.Algorithms.Implementation.ClimbingTheLeaderboard;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] scores = new int[n];
        int unique = 1;
        scores[0] = scan.nextInt();
        for(int i = 1; i < n; i++)
        {
            scores[i] = scan.nextInt();
            if(scores[i] != scores[i - 1])
                unique++;
        }
        int m = scan.nextInt();
        int[] alice = new int[m];
        for(int i = 0; i < m; i++)
            alice[i] = scan.nextInt();

        int ranking = unique + 1;
        for(int i = 0, ind = n - 1; i < m; i++)
        {
            for(; ind >= 0; ind--)
            {
                while(ind >= 0 && alice[i] >= scores[ind])
                {
                    ind--;
                    if(ind == -1 || scores[ind] != scores[ind + 1])
                        ranking--;
                }
                break;
            }
            System.out.println(ranking);
        }
    }
}
