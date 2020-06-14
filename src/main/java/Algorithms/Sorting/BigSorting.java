package Algorithms.Sorting;

import javafx.util.converter.BigIntegerStringConverter;

import java.util.Arrays;
import java.util.Comparator;

/**
 * https://www.hackerrank.com/challenges/big-sorting/problem
 */
public class BigSorting {
    // fails some tests..
    static String[] bigSorting(String[] unsorted) {
        return Arrays.stream(unsorted).map(i -> new BigIntegerStringConverter().fromString(i)).sorted()
                .map(i -> new BigIntegerStringConverter().toString(i)).toArray(String[]::new);
    }

    static String[] bigSorting2(String[] unsorted) {
        Comparator<String> comparator = (s1, s2) ->
                s1.length() == s2.length() ? s1.compareTo(s2) : s1.length() - s2.length();
        Arrays.sort(unsorted, comparator);
        return unsorted;
    }

    public static void main(String[] args) {
        String[] data = {"3141592653589793238462643383279", "1", "3", "10", "3", "5"};
        System.out.println(Arrays.toString(bigSorting(data)));
        System.out.println(Arrays.toString(bigSorting2(data)));
    }
}
