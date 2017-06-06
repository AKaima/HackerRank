package HackerRank.Java.Strings.JavaSubstring;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int start = scan.nextInt();
        int end = scan.nextInt();
        System.out.println(s.substring(start, end));
    }
}
