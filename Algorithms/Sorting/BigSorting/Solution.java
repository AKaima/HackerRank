package HackerRank.Algorithms.Sorting.BigSorting;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 * Created by kaima on 5/27/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] arr = new String[n];
        for(int i = 0; i < n; i++)
            arr[i] = scan.next();

        Arrays.sort(arr, new Comparator<String>() {
            @Override
            public int compare(String s1, String s2) {
                if (s1.length() > s2.length())
                    return 1;
                if (s1.length() < s2.length())
                    return -1;
                for (int i = 0; i < s1.length(); i++) {
                    if (s1.charAt(i) > s2.charAt(i))
                        return 1;
                    if (s1.charAt(i) < s2.charAt(i))
                        return -1;
                }
                return 0;
            }
        });

        StringBuilder sb = new StringBuilder(); //n can be fairly large, so attempt to reduce some of the IO.
        for(String s : arr)
            sb.append(s + "\n");
        System.out.println(sb);
    }
}
