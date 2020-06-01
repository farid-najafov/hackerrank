package Algorithms;

/**
 * https://www.hackerrank.com/challenges/save-the-prisoner/problem
 */
public class SaveThePrisoner {
    static int saveThePrisoner(int n, int m, int s) {
        int x = m + s - 1;
        return x <= n ? x :
                x % n == 0 ? n : x % n;
    }
    public static void main(String[] args) {
        System.out.println( saveThePrisoner(5,2,2) );
    }
}
