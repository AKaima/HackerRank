package HackerRank.Competitions.WeekOfCode32.BallsAndBoxes;

/**
 * Created by kaima on 5/20/17.
 */
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        int[] A = new int[n];
        for(int A_i=0; A_i < n; A_i++){
            A[A_i] = in.nextInt();
        }
        int[] C = new int[m];
        for(int C_i=0; C_i < m; C_i++){
            C[C_i] = in.nextInt();
        }
        int[][] B = new int[n][m];
        for(int B_i=0; B_i < n; B_i++){
            for(int B_j=0; B_j < m; B_j++){
                B[B_i][B_j] = in.nextInt();
            }
        }


        int score = 0;

        for (int color = 0; color < n; color++)
        {
            if (A[color] < 1 || A[color] > 100)
                return;

            PriorityQueue<int[]> lst = new PriorityQueue<>(new Comparator<int[]>(){
                public int compare(int[] a, int[] b) {
                    return b[0] - a[0];
                }
            });

            for (int box = 0; box < m; box++) {
                if (B[color][box] < 0 || B[color][box] > 1000)
                    return;
                lst.add(new int[]{B[color][box], box});
            }

            int colorCount = A[color];
            while (colorCount > 0 && lst.size() > 0) {
                int[] max1 = lst.poll();
                int[] max2 = lst.peek();
                colorCount--;

                int cur = max1[1];

                if (C[cur] > 0) {
                    C[cur]--;
                    score += max1[0];
                }
                else {
                    int tmp = max1[0] - (C[cur] - 1)*(C[cur] - 1) + (C[cur] * C[cur]);
                    if (tmp <= 0)
                        break;
                    if ((lst.size() == 0 && tmp > 0) || (max2 != null && tmp >= max2[0] - (C[max2[1]] - 1)*(C[max2[1]] - 1) + C[max2[1]] * C[max2[1]]))
                    {
                        score += tmp;
                        C[cur]--;
                    }
                }
            }
        }

        System.out.print(score);
        // Write Your Code Here
    }
}
