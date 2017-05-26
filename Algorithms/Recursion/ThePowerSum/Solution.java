package HackerRank.Algorithms.Recursion.ThePowerSum;

import java.io.*;
import java.util.*;

public class Solution {
    public static int solve(int n, int pow, int v)
    {
        if(v < 1)
            return 0;
        if(Math.pow(v, pow) == n)
            return 1 + solve(n, pow, v-1);
        if(Math.pow(v, pow) > n)
            return solve(n, pow, v-1);
        return solve(n, pow, v-1) + solve(n - (int)(Math.pow(v, pow)), pow, v-1);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int pow = scan.nextInt();
        System.out.println(solve(n, pow, (int)Math.pow(n, (1.0/pow))));
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
