package HackerRank.Algorithms.Implementation.BonAppétit;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int t = scan.nextInt();
        int tval = 0;
        int sum = 0;
        for(int i = 0; i < n; i++)
        {
            if(i == t)
            {
                tval = scan.nextInt();
                sum += tval;
                i++;
            }
            sum += scan.nextInt();
        }
        System.out.println((sum/2 == scan.nextInt()) ? tval/2 : "Bon Appetit");
    }
}
