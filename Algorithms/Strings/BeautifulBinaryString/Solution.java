package HackerRank.Algorithms.Strings.BeautifulBinaryString;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String b = scan.next();
        System.out.println((n - b.replaceAll("010", "").length())/3);
    }
}
