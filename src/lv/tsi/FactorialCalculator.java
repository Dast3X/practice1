package lv.tsi;

public class FactorialCalculator {
    static public long factorialLoop(long N) throws Exception {
        long fac = 1;
        if (N == 0) {
            return fac;
        } else if (N > 0) {
            for (int i = 1; i <= N; ++i) {
                fac *= i;
            }
            return fac;
        } else {
            throw new Exception("N Can't be negative");
        }
    }

    static public long factorialRecursion(long N) throws Exception {
        if (N == 0 || N == 1)
            return 1;
        else if (N > 0) {
            return N * factorialRecursion(N - 1);
        } else {
            throw new Exception("N Can't be negative");
        }
    }
}
