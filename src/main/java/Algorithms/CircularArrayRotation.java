package Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**https://www.hackerrank.com/challenges/circular-array-rotation/problem*/

public class CircularArrayRotation {
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        IntStream.range(0, k).forEach(i -> list.add(0, list.get(list.size() - 1 - i)));
        return Arrays.stream(queries).map(list::get).toArray();
    }

    public static void main(String[] args) {
        int[] a = {1, 2, 3};
        int k = 2;
        int[] q = {0, 1, 2};
        System.out.println( Arrays.toString(circularArrayRotation(a, k, q)) );
    }
}
