package Algorithms.Implementation;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/equality-in-a-array/problem
 */
public class EqualizeTheArray {
    static int equalizeArray(int[] arr) {
        Long l = Arrays.stream(arr).boxed()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().max(Long::compareTo).orElseThrow(RuntimeException::new);
        return (int) (arr.length - l);
    }

    public static void main(String[] args) {
        int[] data = {3, 3, 2, 1, 3};
        System.out.println(equalizeArray(data));
    }
}
