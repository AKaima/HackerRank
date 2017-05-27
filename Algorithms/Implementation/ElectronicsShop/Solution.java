package HackerRank.Algorithms.Implementation.ElectronicsShop;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int max = -1;
        int s = scan.nextInt();
        int n = scan.nextInt();
        int m = scan.nextInt();

        int[] kb = new int[n];
        for(int i = 0; i < n; i++)
            kb[i] = scan.nextInt();
        int[] usb = new int[m];
        for(int i = 0; i < m; i++)
            usb[i] = scan.nextInt();

        Arrays.sort(kb);
        Arrays.sort(usb);

        /*
            This for loop may seem somewhat confusing.
            Basically, we initialize i to be n - 1, so that it starts searching from the most expensive keyboard.
            j is set to 0, searching starting from the cheapest usb. We want to initialize j in the outer loop to minimize comparisons.
            When a combination of kb[i] and usb[j] is greater than s, j will remain where it is at rather than returning back to 0, this
                is because since the next keyboard searched is cheaper than the current keyboard, then all of the values of j less than what
                it currently is at will also be less than max.
         */
        for(int i = n - 1, j = 0; i > -1; i--)
        {
            for(; j < m; j++)
            {
                if(kb[i] + usb[j] > s)
                    break;
                if(kb[i] + usb[j] > max)
                    max = kb[i] + usb[j];
            }
        }

        System.out.println(max);
    }
}
