package HackerRank.Algorithms.Sorting.TheFullCountingSort;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        StringBuilder builder = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder[] arr = new StringBuilder[100];
        int n = 0;
        try{
            n = Integer.parseInt(br.readLine());
        }
        catch(IOException e)
        {
            System.out.println(e);
        }
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = new StringBuilder();
        }
        for(int i = 0; i < n; i++)
        {
            String line = "";
            try{
                line = br.readLine(); 
            }
            catch(IOException e)
            {
                System.out.println(e);
            }
            int v = Integer.parseInt(line.split(" ")[0]);
            String s = line.split(" ")[1];
            if(i < n/2)
                arr[v].append("- ");
            else
                arr[v].append(s + " ");
        }
        for(int i = 0; i < arr.length; i++)
        {
            builder.append(arr[i]);
        }
        System.out.print(builder.toString());
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
