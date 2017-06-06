package HackerRank.Java.ExceptionHandling.JavaExceptionHandling;

/**
 * Created by kaima on 6/6/17.
 */
class MyCalculator
{
    public static int power(int n, int p) throws Exception
    {
        if(n < 0 || p < 0)
            throw new Exception ("n and p should be non-negative");
        else
            return ((int)Math.pow(n, p));
    }
}