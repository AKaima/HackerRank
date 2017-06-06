package HackerRank.Java.Introduction.JavaLoopsII;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */

//Definitely not a very reasonable way to do this, but had to try to have a little fun while doing these basic problems.
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        for(int i = 0; i < q; i++)
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int n = scan.nextInt();
            for(int j = 0; j < n; j++)
                System.out.print((a += b * (1 << j)) + " ");
            System.out.println();
        }
    }
}
