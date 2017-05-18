package HackerRank.Algorithms.Implementation.BetweenTwoSets;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] a = new int[n];
        a[0] = in.nextInt();
        int factor = a[0];
        int mfactor = a[0];
        int min = a[0];
        int max = Integer.MAX_VALUE;
        for(int a_i=1; a_i < n; a_i++){
            a[a_i] = in.nextInt();
            if(a[a_i] > min)
                min = a[a_i];
            while(factor % a[a_i] != 0)
                factor += mfactor;
            if(factor != mfactor)
                mfactor = a[a_i]; //a[a_i]
        }
        int[] b = new int[m];
        int count = 0;
        for(int b_i=0; b_i < m; b_i++){
            b[b_i] = in.nextInt();
            if(b[b_i] < max)
                max = b[b_i];
        }
        boolean valid;
        for(int i = factor; i <= max; i+=factor)
        {
            valid = true;
            for(int j = 0; j < m; j++)
            {
                if(b[j] % i != 0)
                    valid = false;
            }
            if(valid)
                count++;
        }
        System.out.println(count);
    }
}

