package HackerRank.Algorithms.Implementation.BeautifulDaysAtTheMovies;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        for(int d = i; d <= j; d++)
        {
            if((d - Integer.parseInt(new StringBuilder().append(d).reverse().toString())) % k == 0)
                count++;
        }
        System.out.println(count);
    }
}
