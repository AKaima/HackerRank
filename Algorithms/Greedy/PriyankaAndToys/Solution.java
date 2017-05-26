package HackerRank.Algorithms.Greedy.PriyankaAndToys;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[scan.nextInt()];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int count = 1;
        int mostRecent = arr[0];
        for(int i = 1; i < arr.length; i++)
        {
            if(arr[i] > mostRecent + 4)
            {
                mostRecent = arr[i];
                count++;
            }
        }
        System.out.println(count);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
