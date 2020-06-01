package Algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/migratory-birds/problem?h_r=internal-search
 */
public class MigratoryBirds {
    static int migratoryBirds(List<Integer> arr) {
        Map<Integer, Long> types = arr.stream()
                .collect(Collectors.groupingBy(a -> a, Collectors.counting()));

        long max_size = types.values().stream()
                .max(Comparator.comparingLong(a -> a))
                .orElseThrow(RuntimeException::new);

        return types.entrySet().stream()
                .filter(e -> e.getValue() == max_size)
                .map(Map.Entry::getKey)
                .min(Comparator.comparingInt(a -> a))
                .orElseThrow(RuntimeException::new);
    }

    public static void main(String[] args) {
        System.out.println( migratoryBirds(Arrays.asList(1, 2, 3, 4, 5, 4, 3, 2, 1, 3, 4)) );
    }
}
