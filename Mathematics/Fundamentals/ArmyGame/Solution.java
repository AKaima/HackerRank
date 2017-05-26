package HackerRank.Mathematics.Fundamentals.ArmyGame;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        if(n % 2 == 1)
            n++;
        if(m % 2 == 1)
            m++;
        System.out.println((n/2) * (m/2));
    }
}

