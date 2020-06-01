package Algorithms;

import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/happy-ladybugs/problem
 */
public class HappyLadyBugs {
    public static boolean alreadyHappy(String s) {
        if (s.length() == 2 && s.charAt(0) != s.charAt(1)) return false;
        return IntStream.range(1, s.length() - 1)
                .noneMatch(i -> s.charAt(i) != s.charAt(i + 1) && s.charAt(i) != s.charAt(i - 1));
    }
    static String happyLadybugs(String b) {
        long count = b.chars().filter(x -> x != '_').mapToObj(i -> (char) i)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .values().stream().filter(i -> i == 1).count();

        if (count == 1) return "NO";
        if (alreadyHappy(b)) return "YES";
        if (count == 0) return b.contains("_") ? "YES" : "NO";
        return "NO";
    }

    public static void main(String[] args) {
        System.out.println(happyLadybugs("GR"));
    }
}
