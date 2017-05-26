package HackerRank.Algorithms.Implementation.AppleAndOrange;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int t = in.nextInt();
        int a = in.nextInt();
        int b = in.nextInt();
        int m = in.nextInt();
        int n = in.nextInt();
        int aCount = 0, oCount = 0;
        for(int apple_i=0; apple_i < m; apple_i++){
            int v = in.nextInt();
            if(v + a >= s && v + a <= t)
                aCount++;
        }
        for(int orange_i=0; orange_i < n; orange_i++){
            int v = in.nextInt();
            if(v + b >= s && v + b <= t)
                oCount++;
        }
        System.out.println(aCount + "\n" + oCount);
    }
}

