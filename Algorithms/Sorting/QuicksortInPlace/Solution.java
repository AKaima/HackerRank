package HackerRank.Algorithms.Sorting.QuicksortInPlace;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    static void quicksort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int p = partition(arr, low, high);

            for(int i = 0; i < arr.length; i++)
                System.out.print(arr[i] + " ");
            System.out.println();

            quicksort(arr, low, p - 1);
            quicksort(arr, p + 1, high);
        }
    }

    static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;
        for(int j = low; j <= high - 1; j++)
        {
            if(arr[j] <= pivot)
            {
                i++;
                if(i != j)
                {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        arr[high] = arr[i + 1];
        arr[i + 1] = pivot;

        return i + 1;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();

        quicksort(arr, 0, n - 1);
    }
}