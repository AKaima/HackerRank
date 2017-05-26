package HackerRank.Algorithms.Implementation.CutTheSticks;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] sticks = new int[n];
        int min = Integer.MAX_VALUE;
        int tempMin = Integer.MAX_VALUE;
        int count = n;
        for(int i = 0; i < n; i++)
        {
            sticks[i] = scan.nextInt();
            if(sticks[i] < min)
                min = sticks[i];
        }
        while(count > 0)
        {
            System.out.println(count);
            count = 0;
            tempMin = min;
            min = Integer.MAX_VALUE;
            for(int i = 0; i < n; i++)
            {
                sticks[i] -= tempMin;
                if(sticks[i] > 0)
                {
                    count++;
                    if(sticks[i] < min)
                        min = sticks[i];
                }
            }
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
