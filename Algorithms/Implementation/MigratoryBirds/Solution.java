package HackerRank.Algorithms.Implementation.MigratoryBirds;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] type = new int[5];
        for(int i = 0; i < n; i++)
        {
            type[scan.nextInt() - 1]++;
        }
        int maxInd = 0;
        for(int i = 1; i < 5; i++)
        {
            if(type[i] > type[maxInd])
                maxInd = i;
        }
        System.out.println(maxInd + 1);
    }
}
