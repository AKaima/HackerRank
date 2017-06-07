package HackerRank.Java.DataStructures.JavaMap;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Created by kaima on 6/7/17.
 */
public class Solution {
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int n = Integer.parseInt(scan.nextLine());
        HashMap<String, String> map = new HashMap<>();
        for(int i = 0; i < n; i++)
            map.put(scan.nextLine(), scan.nextLine());
        while(scan.hasNextLine())
        {
            String key = scan.nextLine();
            System.out.println(map.containsKey(key) ? key + "=" + map.get(key) : "Not found");
        }
    }
}
