package HackerRank.Algorithms.Strings.SuperReducedString;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        for(int i = 0; i < str.length() - 1; i++)
        {
            if(str.charAt(i) == str.charAt(i + 1))
            {
                str = str.substring(0, i) + str.substring(i + 2);
                i = (i > 0 ? i - 2 : i - 1);
            }
        }
        System.out.println(str.isEmpty() ? "Empty String" : str);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
