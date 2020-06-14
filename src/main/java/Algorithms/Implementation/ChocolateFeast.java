package Algorithms.Implementation;

/**
 * https://www.hackerrank.com/challenges/chocolate-feast/problem
 */
public class ChocolateFeast {
    static int chocolateFeast(int n, int c, int m) {
        int cnt = n / c;
        int w = n / c;

        while (w / m != 0) {
            int rw = w % m;
            w = w / m;
            cnt += w;
            w += rw;
        }
        return cnt;
    }

    public static void main(String[] args) {
        System.out.println( chocolateFeast(6, 2, 2) );
    }
}
