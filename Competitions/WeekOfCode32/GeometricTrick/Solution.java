package HackerRank.Competitions.WeekOfCode32.GeometricTrick;

import java.io.*;
import java.util.*;

/**
 * Created by kaima on 5/18/17.
 */
public class Solution implements Closeable {
    private InputReader in = new InputReader(System.in);
    private PrintWriter out = new PrintWriter(System.out);

    private char[] s;

    public void solve() {
        int MAX = in.ni();
        char[] word = in.next().toCharArray();
        s = new char[MAX + 1];
        System.arraycopy(word, 0, s, 1, MAX);
        int res = 0;
        for (int i = 1; i <= MAX; i++) {
            Map<Integer, Integer> fact = factor(i);
            long minK = 1L;
            if (!isSquare(fact)) {
                for (Map.Entry<Integer, Integer> prime : fact.entrySet()) {
                    if (prime.getValue() % 2 == 1) {
                        minK *= prime.getKey();
                    }
                }
            }
            for (long t = 1L; ; t++) {
                long k = minK * t * t;
                long j = (long) Math.sqrt(k * i);
                if (j <= MAX && k <= MAX) {
                    if (s[i] == 'a' && s[(int)j] == 'b' && s[(int)k] == 'c') {
                        res++;
                    }
                }
                else
                    break;
            }
        }
        out.println(res);
    }

    private Map<Integer, Integer> factor(int n) {
        Map<Integer, Integer> fact = new HashMap<>();
        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                fact.put(i, fact.getOrDefault(i, 0) + 1);
                n /= i;
            }
        }
        if (n > 1) {
            fact.put(n, 1);
        }
        return fact;
    }

    private boolean isSquare(Map<Integer, Integer> factorization) {
        boolean even = true;
        for (Map.Entry<Integer, Integer> entry : factorization.entrySet()) {
            even &= entry.getValue() % 2 == 0;
        }
        return even;
    }

    @Override
    public void close() throws IOException {
        in.close();
        out.close();
    }

    static class InputReader {
        public BufferedReader reader;
        public StringTokenizer tokenizer;

        public InputReader(InputStream stream) {
            reader = new BufferedReader(new InputStreamReader(stream), 32768);
            tokenizer = null;
        }

        public String next() {
            while (tokenizer == null || !tokenizer.hasMoreTokens()) {
                try {
                    tokenizer = new StringTokenizer(reader.readLine());
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
            return tokenizer.nextToken();
        }

        public int ni() {
            return Integer.parseInt(next());
        }

        public void close() throws IOException {
            reader.close();
        }
    }

    public static void main(String[] args) throws IOException {
        try (Solution instance = new Solution()) {
            instance.solve();
        }
    }
}
