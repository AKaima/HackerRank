package HackerRank.Algorithms.Sorting.InsertionSortPart2;

import java.util.Scanner;

/**
 * Created by kaima on 5/27/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] arr = new int[s];
        for(int i = 0; i < s; i++)
            arr[i] = scan.nextInt();
        for(int i = 1; i < s; i++)
        {
            for(int j = 0; j < i; j++)
            {
                if(arr[i] < arr[j])
                {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
            for(int v : arr)
                System.out.print(v + " ");
            System.out.println();
        }
    }
}
