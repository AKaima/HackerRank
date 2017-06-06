package HackerRank.Java.Introduction.JavaDateAndTime;

import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */

//Can also be done easily with LocalDate, or if you don't want to use any libraries at all, you can use Zeller's Congruence.
public class Solution {
    public static void main(String[] args)
    {
        String[] days = {"SUNDAY", "MONDAY","TUESDAY", "WEDNESDAY", "THURSDAY","FRIDAY","SATURDAY"};

        Scanner scan = new Scanner(System.in);
        int month = scan.nextInt();
        int day = scan.nextInt();
        int year = scan.nextInt();

        Calendar cal = new GregorianCalendar(year, month - 1, day);
        System.out.println(days[cal.get(Calendar.DAY_OF_WEEK) - 1]);
    }
}
