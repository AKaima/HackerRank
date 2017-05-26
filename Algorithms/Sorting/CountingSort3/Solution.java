package HackerRank.Algorithms.Sorting.CountingSort3;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[100];
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
        {
            arr[scan.nextInt()]++;
            scan.next();
        }
        int count = 0;
        for(int i = 0; i < 100; i++)
        {
            count += arr[i];
            System.out.print(count + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
