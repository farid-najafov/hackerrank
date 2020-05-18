package Algorithms;

import java.util.Arrays;

/**https://www.hackerrank.com/challenges/plus-minus/problem*/

public class PlusMinus {
    static void plusMinus(int[] arr) {
        double a = (double) Arrays.stream(arr).filter(i -> i > 0).count() / arr.length;
        double b = (double) Arrays.stream(arr).filter(i -> i < 0).count() / arr.length;
        double c = (double) Arrays.stream(arr).filter(i -> i == 0).count() / arr.length;

        System.out.print(String.format("%.6f\n%.6f\n%.6f", a, b, c));
    }

    public static void main(String[] args) {
        int[] data = {-4, 3, -9, 0, 4, 1};
        plusMinus(data);
    }
}
