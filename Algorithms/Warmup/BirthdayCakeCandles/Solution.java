package HackerRank.Algorithms.Warmup.BirthdayCakeCandles;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        int highest = 0;
        for(int i = 0; i < n; i++)
        {
            int num = scan.nextInt();
            if(num > highest)
            {
                highest = num;
                count = 0;
            }
            if(num == highest)
                count++;
        }
        System.out.println(count);
    }
}

