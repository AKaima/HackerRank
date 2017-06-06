package HackerRank.Java.Strings.JavaAnagrams;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }

    private static boolean isAnagram(String a, String b) { //Should check sizes as well to avoid unnecessary work.
        int[] count = new int[26];
        for(int i = 0; i < a.length(); i++)
            count[a.charAt(i) % 97 % 65]++;
        for(int i = 0; i < b.length(); i++)
            count[b.charAt(i) % 97 % 65]--;
        boolean valid = true;
        for(int i = 0; i < 26; i++)
            if(count[i] != 0)
                valid = false;
        return valid;
    }
}
