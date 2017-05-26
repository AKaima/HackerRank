package HackerRank.Algorithms.Sorting.CountingSort1;

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
        }
        for(int i = 0; i < n; i++)
        {
            System.out.print(arr[i] + " ");
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
