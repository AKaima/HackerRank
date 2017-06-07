package HackerRank.Java.DataStructures.JavaDequeue;

import java.util.*;

/**
 * Created by kaima on 6/7/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();

        HashMap<Integer, Integer> map = new HashMap<>();
        Deque<Integer> deque = new ArrayDeque<>();
        int max = 0;

        for(int i = 0; i < n; i++)
        {
            if (i >= m) {
                int rem = deque.remove();
                if (map.get(rem) == 1) {
                    map.remove(rem);
                } else {
                    map.put(rem, map.get(rem) - 1);
                }
            }

            int val = scan.nextInt();
            deque.add(val);
            map.merge(val, 1, Integer::sum);

            max = Math.max(max, map.size());
        }

        System.out.println(max);
    }
}
