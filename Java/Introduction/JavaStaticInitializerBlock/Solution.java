package HackerRank.Java.Introduction.JavaStaticInitializerBlock;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
public class Solution {
    static int B, H;
    static boolean flag;

    static {
        Scanner scan = new Scanner(System.in);
        B = scan.nextInt();
        H = scan.nextInt();
        flag = true;
        if(B < 1 || H < 1)
        {
            flag = false;
            System.out.println("java.lang.Exception: Breadth and height must be positive");
        }
    }

    public static void main(String[] args)
    {
        if(flag){
            int area=B*H;
            System.out.print(area);
        }
    }
}
