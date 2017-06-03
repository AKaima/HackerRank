package HackerRank.Algorithms.Sorting.RunningTimeOfQuicksort;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution { //Copied most code from QuicksortInPlace and RunningTimeOfAlgorithms
    static int insertion(int[] arr)
    {
        int count = 0;
        for(int i = 1; i < arr.length; i++)
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
        return count;
    }

    static int quicksort(int[] arr, int low, int high)
    {
        if(low < high)
        {
            int pivot = arr[high];
            int i = low - 1;
            int count = 1;
            for(int j = low; j <= high - 1; j++)
            {
                if(arr[j] <= pivot)
                {
                    i++;
                    count++;
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
            int p = i + 1;
            return count + quicksort(arr, low, p - 1) + quicksort(arr, p + 1, high);
        }
        return 0;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int s = scan.nextInt();
        int[] arr = new int[s];
        int[] arr2 = new int[s];
        for(int i = 0; i < s; i++)
        {
            int val = scan.nextInt();
            arr[i] = val;
            arr2[i] = val;
        }
        System.out.println(insertion(arr) - quicksort(arr2, 0, s - 1));
    }
}
