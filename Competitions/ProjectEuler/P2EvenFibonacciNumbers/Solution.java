package HackerRank.Competitions.ProjectEuler.P2EvenFibonacciNumbers;

/**
 * Created by kaima on 5/22/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
    Too slow to pass all tests. Working on optimization.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        ArrayList<Integer> fib = new ArrayList<Integer>();
        fib.add(2);
        fib.add(8);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            long n = in.nextLong();
            long sum = 0;
            while(fib.get(fib.size() - 1) < n)
            {
                fib.add(4 * fib.get(fib.size() - 1) + fib.get(fib.size() - 2));
            }
            for(int i = 0; i < fib.size(); i++)
            {
                int val = fib.get(i);
                if(val > n)
                    break;
                sum += fib.get(i);
            }
            System.out.println(sum);
        }
    }
}
