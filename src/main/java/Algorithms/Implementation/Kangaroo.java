package Algorithms.Implementation;

/**
 * https://www.hackerrank.com/challenges/kangaroo/problem
 */
public class Kangaroo {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        return  (v2 - v1 == 0 || (x2 - x1) / (v1 - v2) < 0) ? "NO" :
                (x2 - x1) % (v1 - v2) == 0 ? "YES" : "NO";
    }
    public static void main(String[] args) {
        System.out.println( kangaroo(0, 2, 5, 3) );
    }
}
