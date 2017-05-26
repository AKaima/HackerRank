package HackerRank.Algorithms.Strings.GameOfThronesI;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numOdd = 0;
        int[] lets = new int[26];
        String s = scan.next();
        for(int i = 0; i < s.length(); i++)
        {
            lets[s.charAt(i)-97]++;
        }
        for(int i = 0; i < 26; i++)
        {
            if(lets[i] % 2 == 1)
                numOdd++;
        }
        System.out.println((numOdd > 1) ? "NO" : "YES");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
