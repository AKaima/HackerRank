package HackerRank.Algorithms.Implementation.DesignerPDFViewer;

import java.util.Scanner;

/**
 * Created by kaima on 5/28/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int[] h = new int[26];
        for(int i = 0; i < 26; i++)
            h[i] = scan.nextInt();
        char[] s = scan.next().toCharArray();
        int max = 0;
        for(int i = 0; i < s.length; i++)
        {
            if(h[s[i] - 97] > max)
                max = h[s[i] - 97];
        }
        System.out.println(max * s.length);
    }
}
