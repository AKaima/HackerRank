package HackerRank.Algorithms.Implementation.BirthdayChocolate;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int getWays(int[] squares, int d, int m){
        int count = 0;
        int val = 0;
        for(int i = 0; i < m; i++)
        {
            val += squares[i];
        }
        if(val == d)
            count++;
        for(int i = m; i < squares.length; i++)
        {
            val += (squares[i] - squares[i-m]);
            if(val == d)
                count++;
        }
        return count;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] s = new int[n];
        for(int s_i=0; s_i < n; s_i++){
            s[s_i] = in.nextInt();
        }
        int d = in.nextInt();
        int m = in.nextInt();
        int result = getWays(s, d, m);
        System.out.println(result);
    }
}

