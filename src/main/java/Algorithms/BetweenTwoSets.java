package Algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/between-two-sets/problem
 */
public class BetweenTwoSets {
    public static int getTotalX(List<Integer> a, List<Integer> b) {
        int count = 0 ;

        OUTER:
        for (int i = a.get(a.size()-1) ; i <= b.get(0) ; i++) {
            for (Integer item : a) {
                if (i % item != 0)
                    continue OUTER;
            }
            for (Integer item : b) {
                if (item % i != 0)
                    continue OUTER; ;
            }
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println( getTotalX(Arrays.asList(2, 6), Arrays.asList(24, 36)) );
    }
}
