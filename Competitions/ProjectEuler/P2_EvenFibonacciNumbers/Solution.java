package HackerRank.Competitions.ProjectEuler.P2_EvenFibonacciNumbers;

/**
 * Created by kaima on 5/22/17.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long[] fib = new long[28];
        fib[0] = 2;
        fib[1] = 8;
        int i = 2;
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            while(fib[i - 1] < n)
            {
                fib[i] = 4 * fib[i - 1] + fib[i - 2];
                i++;
            }
            for(int j = 0; j < fib.length; j++)
            {
                long val = fib[j];
                if(val > n)
                    break;
                sum += val;
            }
            System.out.println(sum);
        }
    }
}
