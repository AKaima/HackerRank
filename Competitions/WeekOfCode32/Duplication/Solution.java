package HackerRank.Competitions.WeekOfCode32.Duplication;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by kaima on 5/15/17.
 */
public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int t = Integer.parseInt(br.readLine());
        String s = Integer.toBinaryString(0);
        while(s.length() < 1000)
        {
            s = s + s.replace('0', '2').replace('1', '0').replace('2', '1');
        }
        for(int i = 0; i < t; i++)
        {
            System.out.println(s.charAt(Integer.parseInt(br.readLine())));
        }
    }
}
