package HackerRank.Java.Introduction.JavaEndOfFile;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = 0;

        while(scan.hasNext())
            System.out.println(++n + " " + scan.nextLine());
    }
}
