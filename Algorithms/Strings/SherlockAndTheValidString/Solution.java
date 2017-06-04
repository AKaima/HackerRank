package HackerRank.Algorithms.Strings.SherlockAndTheValidString;

import java.util.Scanner;

/**
 * Created by kaima on 6/4/17.
 */
public class Solution { //A lot of the code was already provided. Only the if and the else if statements were slightly edited.
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        int[] count = new int[26];
        for(int i = 0; i < s.length(); i++)
            count[s.charAt(i) - 97]++;
        boolean valid = true;
        int counter = 0;
        for(int i = 0; i < 25; i++)
        {
            if(count[i] != count[i + 1])
            {
                if(count[i] == 1 ^ count[i+1] == 1)
                {
                    counter++;
                    i++;
                }
                else if(count[i] != 0 && count[i+1] != 0 && Math.abs(count[i] - count[i+1]) > 1)
                {
                    valid = false;
                    break;
                }
            }
        }
        if(counter > 1)
            valid = false;
        System.out.println(valid ? "YES" : "NO");
    }
}
