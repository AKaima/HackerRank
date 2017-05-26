using System;
using System.Collections.Generic;
using System.Linq;
using System.Text;
using System.Threading.Tasks;

namespace HackerRank.AI
{
    class botSavesThePrincess
    {
        static void Main(String[] args)
        {
            int m = int.Parse(Console.ReadLine());
            String[] grid = new String[m];
            for (int i = 0; i < m; i++)
            {
                grid[i] = Console.ReadLine();
            }
            displayPathtoPrincess(m, grid);
        }

        static void displayPathtoPrincess(int n, String[] grid)
        {
            int[] coords = new int[4];
            bool mf = false;
            bool pf = false;

            for (int i = 0; i < n; i++)
            {
                for (int j = 0; j < n; j++)
                {
                    if (grid[i][j] == 'm')
                    {
                        coords[0] = i;
                        coords[1] = j;
                        mf = true;
                    }
                    if (grid[i][j] == 'p')
                    {
                        coords[2] = i;
                        coords[3] = j;
                        pf = true;
                    }
                    if (mf && pf)
                    {
                        i = n;
                        break;
                    }
                }
            }

            int xcon, ycon;

            if (coords[0] > coords[2])
                ycon = coords[0] - coords[2];
            else
                ycon = coords[2] - coords[0];

            if (coords[1] > coords[3])
                xcon = coords[1] - coords[3];
            else
                xcon = coords[3] - coords[1];

            for (int i = 0; i < ycon; i++)
            {
                if (coords[0] > coords[2])
                    Console.WriteLine("UP");
                else
                    Console.WriteLine("DOWN");
            }
            for (int i = 0; i < xcon; i++)
            {
                if (coords[1] > coords[3])
                    Console.WriteLine("LEFT");
                else
                    Console.WriteLine("RIGHT");
            }

            Console.ReadLine();
        }
    }
}
