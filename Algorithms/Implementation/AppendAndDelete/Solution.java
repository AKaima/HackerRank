package HackerRank.Algorithms.Implementation.AppendAndDelete;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s1 = scan.next();
        String s2 = scan.next();
        int n = scan.nextInt();
        int c = 0;
        for(int i = 0; i < s1.length() && i < s2.length(); i++)
        {
            if(s1.charAt(i) == s2.charAt(i))
                c++;
            else
                break;
        }
        if((s1.length() + s2.length() - 2 * c) > n)
            System.out.println("No");
        else if((s1.length() + s2.length() - 2 * c) % 2 == n % 2 || (s1.length() + s2.length() - n) < 0)
            System.out.println("Yes");
        else
            System.out.println("No");
    }
}
