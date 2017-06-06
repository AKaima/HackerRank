package HackerRank.Java.BigNumber.JavaBigDecimal;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String[] s = new String[n+2];
        for (int i = 0; i < n; i++) {
            s[i] = scan.next();
        }
        scan.close();

        Arrays.sort(s, 0, n, Collections.reverseOrder((o1, o2) -> {
            BigDecimal a = new BigDecimal(o1);
            BigDecimal b = new BigDecimal(o2);
            return a.compareTo(b);
        }));

        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }
}
