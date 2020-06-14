package Algorithms.WarmUp;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/diagonal-difference/problem
 */
public class DiagonalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        return Math.abs( IntStream.range(0, arr.size()).map(i ->
                arr.get(i).get(i) - arr.get(i).get(arr.size()-1-i)
        ).sum() );
    }

    public static void main(String[] args) {
        List<List<Integer>> list = Arrays.asList(
                Arrays.asList(11, 2, 4),
                Arrays.asList(4, 5, 6),
                Arrays.asList(10, 8, -12)
        );
        System.out.println( diagonalDifference(list) );
    }
}
