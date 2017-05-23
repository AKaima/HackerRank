package HackerRank.Competitions.ProjectEuler.P34DigitFactorials;

/**
 * Created by kaima on 5/23/17.
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] fact = new int[10];
        for(int i = 0; i < 10; i++)
        {
            int val = 1;
            for(int j = 1; j <= i; j++){
                val *= j;
            }
            fact[i] = val;
        }

        int sum = 0;
        for(int i = 10; i < n; i++)
        {
            int fSum = 0;
            int temp = i;
            while(temp > 0)
            {
                fSum += fact[temp % 10];
                temp /= 10;
            }
            if(fSum % i == 0)
                sum += i;
        }

        System.out.println(sum);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}