using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        int[][] a = new int[n][];
        for(int a_i = 0; a_i < n; a_i++){
           string[] a_temp = Console.ReadLine().Split(' ');
           a[a_i] = Array.ConvertAll(a_temp,Int32.Parse);
        }
        int a1 = 0;
        int a2 = 0;
        for(int i = 0; i < n; i++)
            {
            a1 += a[i][i];
            a2 += a[n-i-1][i];
        }
        if(a1 - a2 > 0)
            Console.WriteLine(a1 - a2);
        else
            Console.WriteLine(a2 - a1);
    }
}

