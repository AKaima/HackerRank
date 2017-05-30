package HackerRank.Algorithms.Implementation.BeautifulTriplets;

import javafx.util.Pair;

import java.util.ArrayDeque;
import java.util.Queue;
import java.util.Scanner;

/**
 * Created by kaima on 5/29/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int d = scan.nextInt();
        int count = 0;
        Queue<Pair<Integer, Integer>> q = new ArrayDeque<Pair<Integer, Integer>>();
        for(int i = 0; i < n; i++)
        {
            int val = scan.nextInt();
            while(q.peek() != null && q.peek().getKey() < val - d)
                q.poll();
            if(q.peek() != null && q.peek().getKey() == val - d)
            {
                int num = q.poll().getValue();
                q.offer(new Pair(val, num + 1));
                if(num > 1)
                    count++;
            }
            else
                q.offer(new Pair(val, 1));

        }
        System.out.println(count);
    }
}
