package HackerRank.Java.Strings.TagContentExtractor;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by kaima on 6/6/17.
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
            boolean any = false;

            //Use 2 capture groups, and make sure the closing tag is equal to the first capture group.
            //Try to minimize problems by checking for both '<' and '>', that way that tags meant to contain one of these characters as text can be used.
            Matcher m = Pattern.compile("<(.+?)>([^<>]+)</\\1>").matcher(s);
            while(m.find()) {
                if (m.group(2).length() > 0 ) {
                    System.out.println(m.group(2));
                    any = true;
                }
            }

            if(!any)
                System.out.println("None");
        }
    }
}
