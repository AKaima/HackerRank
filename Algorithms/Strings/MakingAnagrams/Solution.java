package HackerRank.Algorithms.Strings.MakingAnagrams;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        int[] aCount = new int[26];
        int[] bCount = new int[26];
        for(int i = 0; i < a.length(); i++)
            aCount[a.charAt(i) - 97]++;
        for(int i = 0; i < b.length(); i++)
            bCount[b.charAt(i) - 97]++;
        int min = 0;
        for(int i = 0; i < 26; i++)
            min += Math.abs(aCount[i] - bCount[i]);
        System.out.println(min);
    }
}
