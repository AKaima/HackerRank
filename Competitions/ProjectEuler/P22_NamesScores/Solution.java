package HackerRank.Competitions.ProjectEuler.P22_NamesScores;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 5/25/17.
 */
public class Solution { //Could be optimized significantly using hash.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] names = new String[n];
        for(int i = 0; i < n; i++)
        {
            names[i] = scan.next().toLowerCase();
        }
        Arrays.sort(names);
        int q = scan.nextInt();
        for(int i = 0; i < q; i++)
        {
            String s = scan.next().toLowerCase();
            int loc = 0;
            for(int j = 0; j < n; j++)
            {
                if(names[j].equals(s))
                {
                    loc = j;
                    break;
                }
            }
            int val = 0;
            for(int j = 0; j < s.length(); j++)
            {
                val += s.charAt(j) - 96;
            }
            System.out.println(val * (loc + 1));
        }
    }
}
