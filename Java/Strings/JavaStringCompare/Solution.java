package HackerRank.Java.Strings.JavaStringCompare;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = scan.nextInt();
        String small = s.substring(0, n);
        String large = s.substring(0, n);
        for(int i = 1; i <= s.length() - n; i++)
        {
            String str = s.substring(i, n + i);
            if(str.compareTo(small) < 0)
                small = str;
            if(str.compareTo(large) > 0)
                large = str;
        }
        System.out.println(small);
        System.out.println(large);
    }
}
