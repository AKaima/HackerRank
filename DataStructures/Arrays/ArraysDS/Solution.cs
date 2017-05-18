using System;
using System.Collections.Generic;
using System.IO;
using System.Linq;
class Solution {

    static void Main(String[] args) {
        int n = Convert.ToInt32(Console.ReadLine());
        for(int i = 0; i < n; i++)
            {
            string[] arr_temp = Console.ReadLine().Split(' ');
            int[] arr = Array.ConvertAll(arr_temp,Int32.Parse);
            Array.Reverse(arr);
            Console.WriteLine(String.Join(" ", arr));
        }
    }
}

