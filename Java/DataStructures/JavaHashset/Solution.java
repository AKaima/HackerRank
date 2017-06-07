package HackerRank.Java.DataStructures.JavaHashset;

import javafx.util.Pair;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/**
 * Created by kaima on 6/7/17.
 */

//Not the safest approach in practice due to possible collisions, however, due to sections being blocked off, I couldn't
//Import other classes or create my own object to hold the values. JavaFX Pair would work fine here to avoid collisions.
public class Solution {
    public static void main(String[] args)
    {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }

        HashSet<String> hs = new HashSet<>();
        for(int i = 0; i < t; i++)
        {
            hs.add(pair_left[i] + "_" + pair_right[i]);
            System.out.println(hs.size());
        }
    }
}
