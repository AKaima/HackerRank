package HackerRank.Algorithms.Implementation.MinimumDistances;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kaima on 5/29/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        HashMap<Integer, Integer> hm = new HashMap<>();
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < n; i++)
        {
            int val = scan.nextInt();
            if(hm.containsKey(val) && min > i - hm.get(val))
                min = i - hm.get(val);
            hm.put(val, i);
        }
        System.out.println(min == Integer.MAX_VALUE ? -1 : min);
    }
}
