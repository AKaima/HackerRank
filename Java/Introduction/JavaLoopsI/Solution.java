package HackerRank.Java.Introduction.JavaLoopsI;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i <= 10; i++)
            System.out.println(n + " x " + i + " = " + (n*i));
    }
}