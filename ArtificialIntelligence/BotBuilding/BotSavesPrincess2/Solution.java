package HackerRank.ArtificialIntelligence.BotBuilding.BotSavesPrincess2;

import java.util.Scanner;

/**
 * Created by kaima on 5/25/17.
 */

/*
    Really bad implementation, but the task was to simply complete the nextMove function, I assumed without editing the outside code whatsoever.
    Otherwise, I would have preferred to have a variable containing the final location and just move relative to that rather than searching for it
    every time the method is called, as it doesn't move.
 */
public class Solution {
    static void nextMove(int n, int r, int c, String [] grid){
        int pRow = 0, pCol = 0;
        for(int i = 0; i < grid.length; i++)
        {
            if(grid[i].contains("p"))
            {
                pRow = i;
                pCol = grid[i].indexOf("p");
                break;
            }
        }
        if(r > pRow)
            System.out.println("UP");
        else if(r < pRow)
            System.out.println("DOWN");
        else
        {
            if(c > pCol)
                System.out.println("LEFT");
            else if(c < pCol)
                System.out.println("RIGHT");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n,r,c;
        n = in.nextInt();
        r = in.nextInt();
        c = in.nextInt();
        in.useDelimiter("\n");
        String grid[] = new String[n];

        for(int i = 0; i < n; i++) {
            grid[i] = in.next();
        }

        nextMove(n,r,c,grid);
    }
}
