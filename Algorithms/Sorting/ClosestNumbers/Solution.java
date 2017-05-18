package HackerRank.Algorithms.Sorting.ClosestNumbers;

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        String[] s = br.readLine().split(" ");
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
        {
            arr[i] = Integer.parseInt(s[i]);
        }
        Arrays.sort(arr);
        int minAbs = Integer.MAX_VALUE;
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < n-1; i++)
        {
            int absDiff;
            
            if((arr[i] < 0 && arr[i+1] < 0) || (arr[i] > 0 && arr[i+1] > 0))
                absDiff = Math.abs(arr[i] - arr[i+1]);
            else
                absDiff = Math.abs(arr[i]) + Math.abs(arr[i+1]);
            
            if(absDiff < minAbs)
            {
                minAbs = absDiff;
                sb = new StringBuilder();
                sb.append(arr[i] + " " + arr[i+1] + " ");
            }
            else if(absDiff == minAbs)
                sb.append(arr[i] + " " + arr[i+1] + " ");
        }
        
        System.out.println(sb.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
