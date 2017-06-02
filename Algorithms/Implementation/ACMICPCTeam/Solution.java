package HackerRank.Algorithms.Implementation.ACMICPCTeam;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        BigInteger[] s = new BigInteger[n];
        for(int i = 0; i < n; i++)
            s[i] = new BigInteger(scan.next(), 2);
        int max = 0;
        int count = 1;
        for(int i = 0; i < n; i++)
        {
            for(int j = i + 1; j < n; j++)
            {
                int val = s[i].or(s[j]).bitCount();
                if(val > max)
                {
                    max = val;
                    count = 1;
                }
                else if(val == max)
                    count++;
            }
        }
        System.out.println(max);
        System.out.println(count);
    }
}
