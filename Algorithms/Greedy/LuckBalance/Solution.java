package HackerRank.Algorithms.Greedy.LuckBalance;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int luck = 0;
        ArrayList<Integer> al = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int l = scan.nextInt();
            int t = scan.nextInt();
            if(t == 0)
                luck += l;
            else
            {
                al.add(l);
                luck -= l;
            }
        }
        Collections.sort(al);
        Collections.reverse(al);
        k = Math.min(k, al.size());
        for(int i = 0; i < k; i++)
            luck += 2 * al.get(i);
        System.out.println(luck);
    }
}
