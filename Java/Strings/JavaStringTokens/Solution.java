package HackerRank.Java.Strings.JavaStringTokens;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine().trim();
        if(s.length() == 0)
            System.out.println(0);
        else
        {
            String[] arr = s.split("[\\s!,?._'@]+");
            System.out.println(arr.length);
            for(String str : arr)
                System.out.println(str);
        }
    }
}
