package HackerRank.Algorithms.GameTheory.TowerBreakers;

import java.util.Scanner;

/**
 * Created by kaima on 6/4/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for(int i = 0 ; i < t; i++)
        {
            int n = scan.nextInt();
            int m = scan.nextInt();
            System.out.println(m == 1 || n % 2 == 0 ? 2 : 1);
        }
    }
}
