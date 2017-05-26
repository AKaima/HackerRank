package HackerRank.ArtificialIntelligence.StatisticsAndMachineLearning.Day5ComputingTheCorrelation;

/**
 * Created by kaima on 5/23/17.
 */

import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m, p, c;
        double sMP = 0, sPC = 0, sMC = 0, sM2 = 0, sP2 = 0, sC2 = 0, mP = 0, mM = 0, mC = 0, sumM = 0, sumP = 0, sumC = 0;
        double MP, PC, MC, M2, P2, C2;

        for (int i = 0; i < n; i++) {
            m = scan.nextInt();
            p = scan.nextInt();
            c = scan.nextInt();

            sumM += m;
            sumP += p;
            sumC += c;

            sMP += m * p;
            sPC += p * c;
            sMC += m * c;

            sM2 += Math.pow(m, 2);
            sP2 += Math.pow(p, 2);
            sC2 += Math.pow(c, 2);

            mP += p;
            mM += m;
            mC += c;
        }

        mP /= n;
        mM /= n;
        mC /= n;

        M2 = (sM2 + n * (Math.pow(mM, 2)) - 2 * mM * sumM);
        P2 = (sP2 + n * (Math.pow(mP, 2)) - 2 * mP * sumP);
        C2 = (sC2 + n * (Math.pow(mC, 2)) - 2 * mC * sumC);

        MP = sMP - mP * sumM - mM * sumP + mM * mP * n;
        PC = sPC - mC * sumP - mP * sumC + mP * mC * n;
        MC = sMC - mC * sumM - mM * sumC + mM * mC * n;

        System.out.println((double) Math.round((MP / Math.sqrt(M2 * P2)) * 100) / 100);
        System.out.println((double) Math.round((PC / Math.sqrt(P2 * C2)) * 100) / 100);
        System.out.println((double) Math.round((MC / Math.sqrt(M2 * C2)) * 100) / 100);
    }
}