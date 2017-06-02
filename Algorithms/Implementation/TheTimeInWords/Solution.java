package HackerRank.Algorithms.Implementation.TheTimeInWords;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int h = scan.nextInt();
        int m = scan.nextInt();

        HashMap<Integer, String> date = new HashMap<>();
        date.put(1,"one");
        date.put(2,"two");
        date.put(3,"three");
        date.put(4,"four");
        date.put(5,"five");
        date.put(6,"six");
        date.put(7,"seven");
        date.put(8,"eight");
        date.put(9,"nine");
        date.put(10,"ten");
        date.put(11,"eleven");
        date.put(12,"twelve");
        date.put(13,"thirteen");
        date.put(14,"fourteen");
        date.put(15,"fifteen");
        date.put(16,"sixteen");
        date.put(17,"seventeen");
        date.put(18,"eighteen");
        date.put(19,"nineteen");

        if(m == 0)
            System.out.println(date.get(h) + " o' clock");
        else if(m < 30)
        {
            if(m == 1)
                System.out.println("one minute past " + date.get(h));
            else if(m == 15)
                System.out.println("quarter past " + date.get(h));
            else if(m > 20)
                System.out.println("twenty " + date.get(m - 20) + " minutes past " + date.get(h));
            else
                System.out.print(date.get(m) + " minutes past " + date.get(h));
        }
        else if(m == 30)
            System.out.println("half past " + date.get(h));
        else
        {
            if(m == 45)
                System.out.print("quarter to " + date.get((h + 1) % 12));
            else if(m < 40)
                System.out.print("twenty " + date.get(40 - m) + " minutes to " + date.get((h + 1) % 12));
            else if(m > 40)
                System.out.print(date.get(60 - m) + " minutes to " + date.get((h + 1) % 12));
            else
                System.out.println("twenty minutes to " + date.get((h + 1) % 12));
        }
    }
}
