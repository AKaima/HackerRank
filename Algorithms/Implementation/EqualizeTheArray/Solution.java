package HackerRank.Algorithms.Implementation.EqualizeTheArray;

import java.util.Scanner;

/**
 * Created by kaima on 5/29/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int max = 0;
        int a[] = new int[101];
        for(int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[val]++;
            if(a[val] > max)
                max = a[val];
        }

        System.out.println(n - max);
    }
}
