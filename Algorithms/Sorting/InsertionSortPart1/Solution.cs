using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank.Algorithms.ArraysAndSorting
{
    class InsertionSort1
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());

            if(x >= 1 && x <= 1000)
            {
                int[] ar = Array.ConvertAll<string, int>(Console.ReadLine().Split(' '), int.Parse);

                int v = ar[ar.Length - 1];

                for(int i = ar.Length - 2; i >= -1; i--)
                {
                    if (i == -1 || v >= ar[i])
                    {
                        ar[i + 1] = v;

                        foreach (var item in ar)
                        {
                            Console.Write(item.ToString() + " ");
                        }

                        break;
                    }
                    else
                    {
                        ar[i + 1] = ar[i];
                    }
                    foreach (var item in ar)
                    {
                        Console.Write(item.ToString() + " ");
                    }

                    Console.WriteLine();
                }
            }
            Console.ReadLine();
        }
    }
}

