package HackerRank.Algorithms.Strings.TwoStrings;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int p = scan.nextInt();
        for(int i = 0; i < p; i++)
        {
            String a = scan.next();
            String b = scan.next();
            int[] count = new int[26];
            for(int j = 0; j < a.length(); j++)
                count[a.charAt(j) - 97]++;
            String res = "NO";
            for(int j = 0; j < b.length(); j++)
            {
                if(count[b.charAt(j) - 97] > 0)
                {
                    res = "YES";
                    break;
                }
            }
            System.out.println(res);
        }
    }
}
