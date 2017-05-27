package HackerRank.Algorithms.Implementation.CountingValleys;

import java.util.Scanner;

/**
 * Created by kaima on 5/26/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        int valleyCount = 0;
        int curLoc = 0;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        char[] c = scan.next().toCharArray();
        for(int i = 0; i < n; i++)
        {
            if(c[i] == 'U')
            {
                curLoc += 1;
                if(curLoc == 0)
                    valleyCount++;
            }
            else
                curLoc--;
        }
        System.out.println(valleyCount);
    }
}
