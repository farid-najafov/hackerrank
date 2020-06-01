package Algorithms;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem
 */
public class BeautifulDaysAtTheMovies {
    static int reverse(int i) {
        int x = 0;
        while (i > 0) {
            x = x * 10 + i % 10;
            i /= 10;
        }
        return x;
    }
    static int beautifulDays(int i, int j, int k) {
        return (int) IntStream.rangeClosed(i, j).filter(x -> Math.abs(reverse(x) - x) % k == 0).count();
    }

    public static void main(String[] args) {
        System.out.println(beautifulDays(20, 23,6));
    }
}
