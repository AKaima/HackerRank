package HackerRank.Algorithms.Search.MissingNumbers;

import java.util.Scanner;

/**
 * Created by kaima on 5/27/17.
 */
/*
    Quite a lot of ways to optimize this. One idea that comes to mind is having a single array of length 101.
    Instead of initializing a and b separately, we can increment and decrement this array at index scan.nextInt() % 101.
    We'll have to record the minimum value in our pass through of B's values to later retrieve the actual value, but
        max can be ignored because it was only used to minimize the size of the count arrays. Doing this will allow
        us to save some space (minimal amounts), and get rid of the first two for loops that are after the count arrays
        initializations.
 */
public class Solution {
    public static void main(String[] args)
    {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] a = new int[n];
        for(int i = 0; i < n; i++)
            a[i] = scan.nextInt();
        int m = scan.nextInt();
        int[] b = new int[m];
        for(int i = 0; i < m; i++)
        {
            b[i] = scan.nextInt();
            if(b[i] < min)
                min = b[i];
            if(b[i] > max)
                max = b[i];
        }

        int[] aCount = new int[max - min + 1];
        int[] bCount = new int[max - min + 1];
        for(int i = 0; i < n; i++)
            aCount[a[i] - min]++;
        for(int i = 0; i < m; i++)
            bCount[b[i] - min]++;
        for(int i = 0; i < bCount.length; i++)
            if(bCount[i] > aCount[i])
                System.out.print(i + min + " ");
    }
}
