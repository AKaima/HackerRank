using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank.Algorithms.ArraysAndSorting
{
    class IntroToTutorialChallenges
    {
        static void Main(string[] args)
        {
            int v = Convert.ToInt32(Console.ReadLine());

            int n = Convert.ToInt32(Console.ReadLine());

            if(n >= 1 && n <= 1000)
            {
                int[] ar = Array.ConvertAll<string, int>(Console.ReadLine().Split(' '), int.Parse);

                Console.WriteLine(ar.ToList().IndexOf(v));
            }
        }
    }
}

