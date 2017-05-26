package HackerRank.Algorithms.Implementation.SockMerchant;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int count = 0;
        HashSet<Integer> c = new HashSet<Integer>();

        for(int i = 0; i < n; i++)
        {
            int val = scan.nextInt();
            if(c.contains(val))
            {
                count++;
                c.remove(val);
            }
            else
            {
                c.add(val);
            }
        }
        System.out.println(count);
    }
}
