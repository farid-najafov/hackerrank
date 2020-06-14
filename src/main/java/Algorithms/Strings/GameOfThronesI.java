package Algorithms.Strings;

import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/game-of-thrones/problem
 */
public class GameOfThronesI {
    static String gameOfThrones(String s) {
        long count = s.chars()
                .mapToObj(ch -> (char) ch)
                .collect(Collectors.groupingBy(x -> x, Collectors.counting()))
                .values()
                .stream()
                .filter(x -> x % 2 != 0).count();
        return count <= 1 ? "YES" : "NO";
    }
    public static void main(String[] args) {
        String s = "cdefghmnopqrstuvw";
        System.out.println( gameOfThrones(s) );
    }
}
