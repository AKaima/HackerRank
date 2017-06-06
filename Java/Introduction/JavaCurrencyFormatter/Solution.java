package HackerRank.Java.Introduction.JavaCurrencyFormatter;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        double d = scan.nextDouble();
        NumberFormat nf = NumberFormat.getCurrencyInstance(Locale.US);

        String us = NumberFormat.getCurrencyInstance(Locale.US).format(d);
        String india = NumberFormat.getCurrencyInstance(new Locale("en","IN")).format(d);
        String china = NumberFormat.getCurrencyInstance(Locale.CHINA).format(d);
        String france = NumberFormat.getCurrencyInstance(Locale.FRANCE).format(d);

        System.out.println("US: " + us);
        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);
    }
}
