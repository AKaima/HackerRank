package HackerRank.Algorithms.Implementation.ExtraLongFactorials;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        BigInteger b = BigInteger.ONE;
        for(int i = n; i > 1; i--)
            b = b.multiply(BigInteger.valueOf(i));
        System.out.println(b);
    }
}
