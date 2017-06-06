package HackerRank.Java.DataStructures.Java2DArray;

/**
 * Created by kaima on 6/6/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int arr[][] = new int[6][6];
        int max = Integer.MIN_VALUE;
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
                if(j >= 2 && i >= 2)
                {
                    int val = arr[i][j] + arr[i][j-1] + arr[i][j-2] + arr[i-1][j-1] + arr[i-2][j] + arr[i-2][j-1] + arr[i-2][j-2];
                    if(val > max)
                        max = val;
                }
            }
        }
        System.out.println(max);
    }
}
