package HackerRank.Algorithms.Implementation.BiggerIsBetter;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            char[] w = scan.next().toCharArray();
            int pivot = w.length - 1;

            while (pivot > 0 && w[pivot - 1] >= w[pivot])
                pivot--;

            if (pivot <= 0)
                System.out.println("no answer");
            else
            {
                int j = w.length - 1;
                char temp = w[pivot - 1];

                while (w[j] <= w[pivot - 1])
                    j--;

                w[pivot - 1] = w[j];
                w[j] = temp;

                j = w.length - 1;
                while (pivot < j) {
                    temp = w[pivot];
                    w[pivot] = w[j];
                    w[j] = temp;

                    pivot++;
                    j--;
                }
                System.out.println(new String(w));
            }
        }
    }
}
