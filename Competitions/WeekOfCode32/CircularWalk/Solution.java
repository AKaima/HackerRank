package HackerRank.Competitions.WeekOfCode32.CircularWalk;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Created by kaima on 5/16/17.
 */
public class Solution {
    static int circularWalk(int n, int s, int t, int[] r){
        int count = 0;
        Queue<Integer> q = new LinkedList<>();
        q.add(s);
        boolean[] v = new boolean[n]; //visited
        boolean[] a = new boolean[n]; //added
        a[s] = true;

        while (!q.isEmpty()) {
            count++;
            Queue<Integer> tmp = new LinkedList<>();

            while (!q.isEmpty()) {
                int p = q.remove();

                if (!v[p]) {
                    v[p] = true;
                    int rngEnd = p + r[p];
                    for (int i = p - r[p]; i <= rngEnd; i++) {
                        int newS = i < 0 ? n + i : (i >= n ? i % n : i);
                        if (newS == t) {
                            return count;
                        }
                        if (!v[newS] && !a[newS]) {
                            a[newS] = true;
                            tmp.add(newS);
                        }
                    }
                }
            }
            q = tmp;
        }

        return -1;
        // Complete this function
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] s1 = br.readLine().split(" ");
        String[] s2 = br.readLine().split(" ");
        int n = Integer.parseInt(s1[0]);
        int s = Integer.parseInt(s1[1]);
        int t = Integer.parseInt(s1[2]);
        int[] r = new int[n];
        r[0] = Integer.parseInt(s2[0]);
        int g = Integer.parseInt(s2[1]);
        int seed = Integer.parseInt(s2[2]);
        int p = Integer.parseInt(s2[3]);
        for(int i = 1; i < n; i++)
        {
            r[i] = (r[i-1] * g + seed) % p;
        }
        if (r[s] == 0 && s != t) {
            System.out.println(-1);
            return;
        }
        if (s == t) {
            System.out.println(0);
            return;
        }
        System.out.println(circularWalk(n, s, t, r));
    }
}
