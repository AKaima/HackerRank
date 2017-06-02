package HackerRank.Algorithms.Implementation.ModifiedKaprekarNumbers;

import java.util.Scanner;

/**
 * Created by kaima on 5/30/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        long p = scan.nextInt();
        long q = scan.nextInt();
        boolean any = false;
        for(long i = p; i <= q; i++)
        {
            long sq = i * i;
            long l = (long)(Math.log10(sq)+2)/2;
            if(i == sq/(long)Math.pow(10, l) + sq%(long)Math.pow(10, l))
            {
                System.out.print(i + " ");
                any = true;
            }
        }
        if(!any)
            System.out.println("INVALID RANGE");
    }
}
