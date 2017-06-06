package HackerRank.Java.Strings.JavaStringReverse;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        System.out.println(new StringBuilder(s).reverse().toString().equals(s) ? "Yes" : "No");
    }
}
