package HackerRank.Algorithms.Implementation.JumpingOnTheCloudsRevisited;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int[] clouds = new int[n];
        for(int i = 0; i < n; i++)
        {
            if(scan.nextInt() == 1)
                clouds[i] = 1;
        }
        int e = 99;
        int loc = 0;
        for(; e > 0; e--) //dowhile is also a good choice here
        {
            loc = (loc + k) % n;
            if(clouds[loc] == 1)
                e -= 2;
            if(loc == 0)
                break;
        }
        System.out.println(e);
    }
}
