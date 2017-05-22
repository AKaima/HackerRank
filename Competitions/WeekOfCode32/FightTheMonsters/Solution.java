package HackerRank.Competitions.WeekOfCode32.FightTheMonsters;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by kaima on 5/15/17.
 */
public class Solution {
    static int getMaxMonsters(int n, int hit, int t, int[] h){
        Arrays.sort(h);
        int count = 0;
        while(t > 0)
        {
            h[count] -= hit;
            if(h[count] <= 0)
                count++;
            t--;
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int hit = in.nextInt();
        int t = in.nextInt();
        int[] h = new int[n];
        for(int h_i=0; h_i < n; h_i++){
            h[h_i] = in.nextInt();
        }
        int result = getMaxMonsters(n, hit, t, h);
        System.out.println(result);
    }
}
