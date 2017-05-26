package HackerRank.Algorithms.Warmup.MiniMaxSum;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long a = in.nextLong();
        long b = in.nextLong();
        long c = in.nextLong();
        long d = in.nextLong();
        long e = in.nextLong();
        long val = -(Math.max(Math.max(Math.max(Math.max(a, b), c), d), e));
        long val2 = -(Math.min(Math.min(Math.min(Math.min(a, b), c), d), e));
        System.out.println((val + a + b + c + d + e) + " " + (val2 + a + b + c + d + e));
    }
}

