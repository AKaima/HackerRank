package HackerRank.Java.ExceptionHandling.JavaExceptionHandlingTryCatch;

/**
 * Created by kaima on 6/6/17.
 */
import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println(scanner.nextInt()/scanner.nextInt());
        } catch (ArithmeticException e) {
            System.out.println(e);
        } catch (InputMismatchException e) {
            System.out.println(e.getClass().getName());
        }
    }
}