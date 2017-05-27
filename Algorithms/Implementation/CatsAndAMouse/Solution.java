package HackerRank.Algorithms.Implementation.CatsAndAMouse;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0; i < t; i++)
        {
            int x = scan.nextInt();
            int y = scan.nextInt();
            int z = scan.nextInt();
            x = Math.abs(x - z);
            y = Math.abs(y - z);
            System.out.println(x == y ? "Mouse C" : x < y ? "Cat A" : "Cat B");
        }
    }
}
