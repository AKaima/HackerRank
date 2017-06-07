package HackerRank.Java.Strings.JavaRegex;

import java.util.Scanner;

/**
 * Created by kaima on 6/6/17.
 */
class Solution{
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }

    }
}

class MyRegex {
    String range = "([01]?[0-9]?[0-9]|2[0-4][0-9]|25[0-5])";
    String pattern = range + "." + range + "." + range + "." + range;
}