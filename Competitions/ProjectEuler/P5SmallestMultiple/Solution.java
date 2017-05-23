package HackerRank.Competitions.ProjectEuler.P5SmallestMultiple;

/**
 * Created by kaima on 5/23/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;


/*
    Can be greatly optimized using prime factors.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int a0 = 0; a0 < t; a0++){
            int n = in.nextInt();
            int val = n;
            for(int i = n; i > 0; i--)
            {
                if(val % i != 0)
                {
                    i = n;
                    val += n;
                }
            }
            System.out.println(val);
        }
    }
}
