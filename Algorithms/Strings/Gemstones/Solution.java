package HackerRank.Algorithms.Strings.Gemstones;

import java.util.Scanner;

/**
 * Created by kaima on 6/2/17.
 */
public class Solution { //Using BitSet would likely be a lot faster for larger tests, but unnecessary for this question.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        boolean[] gems = new boolean[26];
        for(int i = 0; i < 26; i++)
            gems[i] = true;
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
        {
            String s = scan.next();
            for(int j = 0; j < 26; j++)
            {
                if(s.indexOf((char)('a' + j)) == -1)
                    gems[j] = false;
            }
        }
        int count = 0;
        for(int  i = 0; i < 26; i++)
            if(gems[i] == true)
                count++;
        System.out.println(count);
    }
}
