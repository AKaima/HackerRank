using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank
{
    class FlippingBits
    {
        static void Main(string[] args)
        {
            int x = Convert.ToInt32(Console.ReadLine());
            List<UInt32> ints = new List<uint>();

            for(int i = 0; i < x; i++)
            {
                ints.Add(Convert.ToUInt32(Console.ReadLine()));
            }

            foreach(UInt32 val in ints)
            {
                Console.WriteLine(~val);
            }
        }
    }
}

