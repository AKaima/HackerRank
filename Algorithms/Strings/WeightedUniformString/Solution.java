package HackerRank.Algorithms.Strings.WeightedUniformString;

import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kaima on 6/4/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int n = scan.nextInt();
        HashSet<Integer> valid = new HashSet<>();
        int count = 0;
        char curChar = 'a';
        for(int i = 0; i < s.length(); i++)
        {
            if(!(s.charAt(i) == curChar))
            {
                count = 0;
                curChar = s.charAt(i);
            }
            valid.add(++count * (curChar - 96));
        }
        for(int i = 0; i < n; i++)
            System.out.println(valid.contains(scan.nextInt()) ? "Yes" : "No");
    }
}
