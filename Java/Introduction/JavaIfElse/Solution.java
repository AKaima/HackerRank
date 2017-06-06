package HackerRank.Java.Introduction.JavaIfElse;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String ans;
        if(n % 2 == 1 || (n >= 6 && n <= 20))
            ans = "Weird";
        else
            ans = "Not Weird";
        System.out.println(ans);
    }
}
