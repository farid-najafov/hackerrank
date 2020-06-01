package Algorithms;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/find-digits/problem
 */
public class FindDigits {
    static int findDigits(int n) {
        int k = n;
        int count = 0;
        List<Integer> list = new ArrayList<>();
        while (k > 0) {
            list.add(k % 10);
            k /= 10;
        }
        for (Integer i : list) {
            if (i != 0 && n / i != 0) count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }
}
