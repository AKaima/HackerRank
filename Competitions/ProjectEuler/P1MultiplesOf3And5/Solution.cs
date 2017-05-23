using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank.Euler
{
    class Multiples3And5
    {
        static void Main(string[] args)
        {
            long x = Convert.ToInt64(Console.ReadLine());
            for(int i = 0; i < x; i++)
            {
                long total = 0;
                long w = Convert.ToInt64(Console.ReadLine());
                total = func(3, w) + func(5, w) - func(15, w);
                Console.WriteLine(total);
            }
        }

        static long func(long p, long n)
        {
            long j;
            n = n - 1;
            j = n / p;
            return (p * j * (j + 1)) / 2;
        }
    }
}
