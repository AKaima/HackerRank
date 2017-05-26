package HackerRank.Algorithms.Strings.Pangrams;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] let = new int[26];
        String s = scan.nextLine();
        s = s.replaceAll(" ", "").toLowerCase();
        for(int i = 0; i < s.length(); i++)
        {
            let[s.charAt(i) - 97]++;
        }
        boolean valid = true;
        for(int i = 0; i < let.length; i++)
        {
            if(let[i] == 0)
                valid = false;
        }
        System.out.println(valid ? "pangram" : "not pangram");
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
