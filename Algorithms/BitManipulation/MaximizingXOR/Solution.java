package HackerRank.Algorithms.BitManipulation.MaximizingXOR;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int xor = scan.nextInt() ^ scan.nextInt();
        int sigBit = 31 - Integer.numberOfLeadingZeros(xor);

        System.out.println((1 << (sigBit + 1)) - 1);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
