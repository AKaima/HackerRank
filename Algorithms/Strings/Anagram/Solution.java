package HackerRank.Algorithms.Strings.Anagram;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution { //Reused a lot of the code from MakingAnagrams
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            String s = scan.next();
            if(s.length() % 2 == 1)
                System.out.println(-1);
            else
            {
                String s1 = s.substring(0, s.length() / 2);
                String s2 = s.substring(s.length()/2, s.length());

                int[] aCount = new int[26];
                int[] bCount = new int[26];
                for(int j = 0; j < s1.length(); j++)
                    aCount[s1.charAt(j) - 97]++;
                for(int j = 0; j < s2.length(); j++)
                    bCount[s2.charAt(j) - 97]++;
                int min = 0;
                for(int j = 0; j < 26; j++)
                    min += Math.abs(aCount[j] - bCount[j]);
                System.out.println(min / 2);
            }
        }
    }
}
