using System;
using System.Collections.Generic;
using System.IO;
using System.Numerics;

class Solution {
    static void Main(String[] args) {
        string[] s = Console.ReadLine().Split(' ');
        BigInteger t1 = BigInteger.Parse(s[0]);
        BigInteger t2 = BigInteger.Parse(s[1]);
        BigInteger temp;
        int n = int.Parse(s[2]);
        
        for(int i = 2; i < n; i++)
<<<<<<< HEAD
        {
=======
            {
>>>>>>> 44f6bb409c9ca688230a52ea09adbdf927e4030c
            temp = t1 + (t2 * t2);
            t1 = t2;
            t2 = temp;
        }
        
        Console.WriteLine(t2);
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution */
    }
}
