package HackerRank.Algorithms.Strings.AlternatingCharacters;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            String s = scan.next();
            int count = 0;
            for(int j = 0; j < s.length() - 1; j++)
            {
                if(s.charAt(j) == s.charAt(j+1))
                    count++;
            }
            System.out.println(count);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}

