package HackerRank.Java.DataStructures.JavaArraylist;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<ArrayList<Integer>> al = new ArrayList<>();
        for(int i = 0; i < n; i++)
        {
            int size = scan.nextInt();
            ArrayList<Integer> newAl = new ArrayList<>();
            for(int j = 0; j < size; j++)
                newAl.add(scan.nextInt());
            al.add(newAl);
        }
        int q = scan.nextInt();
        for(int i = 0; i < q; i++)
        {
            int alNum = scan.nextInt();
            int index = scan.nextInt();
            if(al.size() >= alNum && al.get(alNum - 1).size() >= index) //Can also use tryCatch with IndexOutOfBoundsException.
                System.out.println(al.get(alNum - 1).get(index - 1));
            else
                System.out.println("ERROR!");
        }
    }
}
