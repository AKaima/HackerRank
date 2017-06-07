package HackerRank.Java.Strings.PatternSyntaxChecker;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;

/**
 * Created by kaima on 6/7/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        for(int i = 0; i < n; i++)
        {
            String s = scan.nextLine();
            try
            {
                Pattern.compile(s);
                System.out.println("Valid");
            }
            catch(PatternSyntaxException e)
            {
                System.out.println("Invalid");
            }
        }
    }
}
