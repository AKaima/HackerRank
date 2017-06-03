package HackerRank.Algorithms.Greedy.MarkAndToys;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        int[] toys = new int[n];
        for(int i = 0; i < n; i++)
            toys[i] = scan.nextInt();
        Arrays.sort(toys);
        for(int i = 0; i < n; i++)
        {
            if(k < toys[i])
                break;
            count++;
            k -= toys[i];
        }
        System.out.println(count);
    }
}
