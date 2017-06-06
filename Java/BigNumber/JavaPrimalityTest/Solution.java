package HackerRank.Java.BigNumber.JavaPrimalityTest;

import java.math.BigInteger;
import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        BigInteger n = scan.nextBigInteger();
        scan.close();
        System.out.println(n.isProbablePrime(1) ? "prime" : "not prime");
    }
}
