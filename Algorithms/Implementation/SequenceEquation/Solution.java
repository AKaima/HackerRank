package HackerRank.Algorithms.Implementation.SequenceEquation;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer,Integer> hm = new HashMap<Integer,Integer>();
        for(int i = 1; i <= n; i++)
            hm.put(scan.nextInt(), i);
        for(int i = 1; i <= n; i++)
            System.out.println(hm.get(hm.get(i)));
    }
}
