package HackerRank.Algorithms.Implementation.Service;

import java.util.Scanner;

/**
 * Created by Ayzhin on 7/11/2014.
 */

public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String lineToPrint = "";
        int[] lane = new int[scan.nextInt()];
        int numCases = scan.nextInt();

        for(int i = 0; i < lane.length; i++)
            lane[i] = scan.nextInt();

        int currentCase = 0;

        while(currentCase < numCases)
        {
            int lowest = 3;

            int small = scan.nextInt();
            int high = scan.nextInt();

            for(int i = small; i <= high; i++)
                if(lane[i] < lowest)
                    lowest = lane[i];

            lineToPrint += lowest + "\n";

            currentCase++;
        }

        System.out.print(lineToPrint);
    }
}

