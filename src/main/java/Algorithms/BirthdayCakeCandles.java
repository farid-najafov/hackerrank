package Algorithms;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/birthday-cake-candles/problem
 */
public class BirthdayCakeCandles {
    static int birthdayCakeCandles(int[] ar) {
        int i = Arrays.stream(ar).max().orElseThrow(RuntimeException::new);
        return (int) Arrays.stream(ar).filter(x -> x == i).count();
    }

    public static void main(String[] args) {
        int[] data = {3, 2, 1, 3};
        System.out.println( birthdayCakeCandles(data) );
    }
}
