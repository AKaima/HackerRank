package HackerRank.Algorithms.Sorting.FindTheMedian;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.nextInt();
        System.out.println(select(arr, 0, arr.length - 1, arr.length/2)); //Only works with odd n. (Problem states n will be odd)
    }

    static int select(int[] arr, int left, int right, int k)
    {
        if(left == right)
            return arr[left];
        int pivot = left + (int)Math.floor((Math.random() * arr.length) % (right - left + 1));
        pivot = partition(arr, left, right, pivot);
        if(k == pivot)
            return arr[k];
        else if (k < pivot)
            return select(arr, left, pivot - 1, k);
        else
            return select(arr, pivot + 1, right, k);
    }

    static int partition(int[] arr, int left, int right, int pivot)
    {
        int pivotVal = arr[pivot];
        arr[pivot] = arr[right];
        arr[right ] = pivotVal;
        int storeIndex = left;
        for(int i = left; i < right; i++)
        {
            if(arr[i] < pivotVal)
            {
                int temp = arr[storeIndex];
                arr[storeIndex] = arr[i];
                arr[i] = temp;
                storeIndex++;
            }
        }
        int temp = arr[right];
        arr[right] = arr[storeIndex];
        arr[storeIndex] = temp;
        return storeIndex;
    }
}
