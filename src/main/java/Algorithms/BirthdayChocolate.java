package Algorithms;

import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/the-birthday-bar/problem
 */
public class BirthdayChocolate {
    static int birthday(List<Integer> s, int d, int m) {
        return IntStream.rangeClosed(0, s.size() - m)
                .map(i -> (s.subList(i, i + m).stream().mapToInt(x -> x).sum()) == d ? 1 : 0).sum();
    }
    public static void main(String[] args) {
        List<Integer> list = Collections.singletonList(4);
        System.out.println(birthday(list, 4, 1));
    }
}
