package HackerRank.Algorithms.Sorting.Quicksort1Partition;

import java.util.Scanner;

/**
 * Created by kaima on 5/27/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int p = scan.nextInt();
        String s = "";
        for(int i = 1; i < n; i++)
        {
            int val = scan.nextInt();
            if(val < p)
                System.out.print(val + " ");
            else //Don't have to worry about when it is equal due to the problem stating all elements are unique.
                s += val + " ";
        }
        System.out.print(p + " " + s);
    }
}
