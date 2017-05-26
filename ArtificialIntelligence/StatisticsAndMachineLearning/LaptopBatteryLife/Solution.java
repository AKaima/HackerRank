package HackerRank.ArtificialIntelligence.StatisticsAndMachineLearning.LaptopBatteryLife;

/**
 * Created by kaima on 5/23/17.
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double timeCharged = in.nextDouble();
        if(timeCharged >= 4.00)
            System.out.println(8.00);
        else
            System.out.println(timeCharged * 2);
    }
}
