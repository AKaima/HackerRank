package HackerRank.Java.DataStructures.Java1DArray;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            int val = scan.nextInt();
            a[i] = val;
        }

        scan.close();

        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }
}