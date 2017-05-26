package HackerRank.Algorithms.Greedy.MarcsCakewalk;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] calories = new int[n];
        for(int calories_i=0; calories_i < n; calories_i++){
            calories[calories_i] = in.nextInt();
        }
        Arrays.sort(calories);
        long miles = 0;
        for(int i = n-1; i >= 0; i--)
        {
            miles += calories[i] * Math.pow(2, n-i-1);
        }
        System.out.println(miles);
        // your code goes here
    }
}

