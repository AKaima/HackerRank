package HackerRank.Java.Advanced.JavaMD5;

/**
 * Created by kaima on 6/6/17.
 */
import java.io.*;
import java.util.*;
import java.security.*;
import java.nio.charset.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.next();
        try{
            MessageDigest digest = MessageDigest.getInstance("MD5");
            byte[] hash = digest.digest(s.getBytes(StandardCharsets.UTF_8));
            System.out.println(bytesToHex(hash));
        }
        catch(NoSuchAlgorithmException e)
        {
            System.out.println(e);
        }
    }

    private static String bytesToHex(byte[] hash) {
        StringBuffer hexString = new StringBuffer();
        for (int i = 0; i < hash.length; i++) {
            String hex = Integer.toHexString(0xff & hash[i]);
            if(hex.length() == 1) hexString.append('0');
            hexString.append(hex);
        }
        return hexString.toString();
    }
}