package HackerRank.Algorithms.Strings.HackerRankInAString;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        char[] hr = {'h', 'a', 'c', 'k', 'e', 'r', 'r', 'a', 'n', 'k'};
        int q = in.nextInt();
        for(int a0 = 0; a0 < q; a0++){
            String s = in.next();
            int num = 0;
            for(int i = 0; i < s.length(); i++)
            {
                if(num < 10)
                    if(s.charAt(i) == hr[num])
                        num++;
            }
            System.out.println(num == 10 ? "YES": "NO");
            // your code goes here
        }
    }
}

