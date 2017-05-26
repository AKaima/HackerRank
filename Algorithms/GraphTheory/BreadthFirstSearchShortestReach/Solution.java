package HackerRank.Algorithms.GraphTheory.BreadthFirstSearchShortestReach;

import java.io.*;
import java.util.*;

public class Solution {
    public static int[] BFS(int source, int[][] g){
        int[] dist = new int[g.length];
        for (int i=0; i<dist.length; i++)
        {
            dist[i] = -1;
        }

        Queue<Integer> q = new LinkedList<Integer>();

        q.add(source);
        dist[source] = 0;
        
        while(!q.isEmpty()){
            int next = q.remove();

            for (int i=0; i < g.length; i++){
                if (g[next][i] == 1 && dist[i] == -1){
                    dist[i] = dist[next] + 1;
                    q.add(i);
                }
            }
        }
        return dist;
    }
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = scan.nextInt();
        for (int i=0; i < t; i++){
            int N = scan.nextInt();
            int M = scan.nextInt();
            int[][] g = new int[N][N];
            for (int j=0; j<M; j++){
                int u = scan.nextInt()-1;
                int v = scan.nextInt()-1;
                g[u][v] = 1;
                g[v][u] = 1;
            }
            int source = scan.nextInt()-1;
            int[] dist = BFS(source, g);
            for(int j=0; j < dist.length; j++){
                if (dist[j] == -1)
                    System.out.print(dist[j] + " ");
                else if (dist[j] != 0)
                    System.out.print((dist[j] * 6) + " ");
            }
            System.out.println("");
        }
    }
}
