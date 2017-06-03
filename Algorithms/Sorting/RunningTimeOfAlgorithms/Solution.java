package HackerRank.Algorithms.Sorting.RunningTimeOfAlgorithms;

/**
 * Created by kaima on 6/2/17.
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int count = 0;
        int[] arr = new int[s];
        for(int i = 0; i < s; i++)
            arr[i] = scan.nextInt();
        for(int i = 1; i < s; i++)
        {
            for(int j = i - 1; j > -1; j--)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                    count++;
                    i -= 2;
                }
            }
        }
        System.out.println(count);
    }
}
