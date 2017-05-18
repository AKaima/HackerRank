package HackerRank.Algorithms.Implementation.FairRations;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int B[] = new int[N];
        for(int B_i=0; B_i < N; B_i++){
            B[B_i] = in.nextInt();
        }
        int count = 0;
        for(int i = 0; i < B.length - 1; i++)
        {
            if(B[i] % 2 == 1)
            {
                B[i]++;
                B[i+1]++;
                count += 2;
            }
        }
        System.out.println((B[B.length - 1] % 2 == 1) ? "NO" : count);
    }
}

