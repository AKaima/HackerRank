package HackerRank.Mathematics.Algebra.EasySum;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            long n = scan.nextInt();
            long m = scan.nextInt();
            System.out.println(((n/m)*m*(m-1))/2 + ((n%m)*((n%m)+1))/2);
        }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
