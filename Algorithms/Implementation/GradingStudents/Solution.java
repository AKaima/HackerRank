package HackerRank.Algorithms.Implementation.GradingStudents;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int solve(int grade){
        final int min = 37;
        if(grade > min && ((grade + 3) > ((grade / 5) + 1) * 5))
            return ((grade / 5) + 1) * 5;
        else
            return grade;
        // Complete this function
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i=0; i < n; i++){
            System.out.println(solve(in.nextInt()));
        }
    }
}

