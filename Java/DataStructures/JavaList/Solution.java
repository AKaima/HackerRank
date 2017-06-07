package HackerRank.Java.DataStructures.JavaList;

import java.util.LinkedList;
import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        LinkedList<Integer> list = new LinkedList<>();
        int n = scan.nextInt();
        for(int i = 0; i < n; i++)
            list.add(scan.nextInt());
        int q = scan.nextInt();
        for(int i = 0; i < q; i++)
        {
            String type = scan.next();
            int index = scan.nextInt();
            if(type.equals("Insert"))
                list.add(index, scan.nextInt());
            else
                list.remove(index);
        }
        for(int val : list)
            System.out.print(val + " ");
    }
}
