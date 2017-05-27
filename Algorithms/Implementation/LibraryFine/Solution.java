package HackerRank.Algorithms.Implementation.LibraryFine;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int recDay = scan.nextInt();
        int recMonth = scan.nextInt();
        int recYear = scan.nextInt();
        int dueDay = scan.nextInt();
        int dueMonth = scan.nextInt();
        int dueYear = scan.nextInt();
        if(dueYear < recYear)
            System.out.println(10000);
        else if(dueYear == recYear && dueMonth < recMonth)
            System.out.println(500 * (recMonth - dueMonth));
        else if(dueYear == recYear && dueMonth == recMonth && dueDay < recDay)
            System.out.println(15 * (recDay - dueDay));
        else
            System.out.println(0);
    }
}
