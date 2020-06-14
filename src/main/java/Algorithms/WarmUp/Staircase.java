package Algorithms.WarmUp;

/**
 * https://www.hackerrank.com/challenges/staircase/problem
 */
public class Staircase {
    static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println( i + j >= n - 1 ? "#" : " " );
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        staircase(5);
    }
}
