package Algorithms.Implementation;

/**
 * https://www.hackerrank.com/challenges/halloween-sale/problem
 */
public class HalloweenSale {
    static int howManyGames(int p, int d, int m, int s) {
        int cnt = 0;
        while (s >= p) {
            cnt++;
            s -= p;
            p = Math.max(p - d, m);
        }
        return cnt;
    }
    public static void main(String[] args) {
        System.out.println( howManyGames(20, 3, 6, 85) );
    }
}
