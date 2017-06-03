package HackerRank.Algorithms.Sorting.Quicksort2Sorting;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    static ArrayList quickSort(ArrayList<Integer> arr)
    {
        int pivot = arr.get(0);
        ArrayList<Integer> left = new ArrayList<>();
        ArrayList<Integer> equal = new ArrayList<>();
        ArrayList<Integer> right = new ArrayList<>();

        for(int i = 0; i < arr.size(); i++)
        {
            if(arr.get(i) < pivot)
                left.add(arr.get(i));
            else if(arr.get(i) == pivot)
                equal.add(arr.get(i));
            else
                right.add(arr.get(i));
        }

        if(left.size() > 1)
            left = quickSort(left);
        if(right.size() > 1)
            right = quickSort(right);

        left.addAll(equal);
        left.addAll(right);

        for(int i = 0; i < left.size(); i++)
            System.out.print(left.get(i));
        System.out.println();

        return left;
    }

    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < n; i++)
            arr.add(scan.nextInt());
        quickSort(arr);
    }
}
