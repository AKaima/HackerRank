package HackerRank.Algorithms.Strings.MarsExploration;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String s1 = in.next();
        String s2 = String.join("", Collections.nCopies(s1.length()/3, "SOS"));
        int count = 0;
        for(int i = 0; i < s1.length(); i++)
        {
            if(s1.charAt(i) != s2.charAt(i))
                count++;
        }
        System.out.println(count);
    }
}

