using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank
{
    class LonelyInteger
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());
            List<int> arr = new List<int>(x);

            arr = Array.ConvertAll<string, int>(Console.ReadLine().Split(' '), int.Parse).ToList<int>();

            Console.WriteLine(lonelyInteger(arr));
        }

        static int lonelyInteger(List<int> a)
        {
            foreach(int x in a)
            {
                if (a.IndexOf(x) == a.LastIndexOf(x))
                    return x;
            }

            return 0;
        }
    }
}

