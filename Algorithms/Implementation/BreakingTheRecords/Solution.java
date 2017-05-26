package HackerRank.Algorithms.Implementation.BreakingTheRecords;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int[] getRecord(int[] s){
        int highest = s[0], lowest = s[0];
        int[] num = {0, 0};
        for(int i = 1; i < s.length; i++)
        {
            if(s[i] > highest)
            {
                highest = s[i];
                num[0]++;
            }
            else if(s[i] < lowest)
            {
                lowest = s[i];
                num[1]++;
            }
        }
        return num;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int[] result = getRecord(s);
        String separator = "", delimiter = " ";
        for (Integer val : result) {
            System.out.print(separator + val);
            separator = delimiter;
        }
        System.out.println("");
    }
}

