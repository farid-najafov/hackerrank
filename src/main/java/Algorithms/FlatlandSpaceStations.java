package Algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/flatland-space-stations/problem
 */
public class FlatlandSpaceStations {
    static int flatlandSpaceStations(int n, int[] c) {
        if (n == c.length) return 0;
        return IntStream.range(0, n).flatMap(i ->
                IntStream.of(Arrays.stream(c).map(x -> Math.abs(x - i)).min().orElseThrow(RuntimeException::new)))
                .max().orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) {
        System.out.println( flatlandSpaceStations(5, new int[]{0, 4}) );
    }
}
