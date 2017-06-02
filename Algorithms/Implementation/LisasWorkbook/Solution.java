package HackerRank.Algorithms.Implementation.LisasWorkbook;

import java.util.Scanner;

/**
 * Created by kaima on 5/31/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int count = 0;
        int page = 1;
        for(int i = 0; i < n; i++)
        {
            int num = scan.nextInt();
            for(int j = 1; j <= num; j++)
            {
                if(page == j)
                    count++;
                if(num == j || j % k == 0)
                    page++;
            }
        }
        System.out.println(count);
    }
}
