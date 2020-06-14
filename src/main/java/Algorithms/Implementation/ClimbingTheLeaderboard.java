package Algorithms.Implementation;

import java.util.*;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/climbing-the-leaderboard/problem
 */
public class ClimbingTheLeaderboard {

    static int[] climbingLeaderboard(int[] scores, int[] alice) {
        int[] result = new int[alice.length];

        Integer[] sc = Arrays.stream(scores).boxed().distinct().toArray(Integer[]::new);

        IntStream.range(0, alice.length).forEach(i -> {
            int x = Arrays.binarySearch(sc, alice[i], Collections.reverseOrder());
            result[i] = x < 0 ? -x : x + 1;
        });

        return result;
    }
    public static void main(String[] args) {
        int[] scores = {100, 90, 90, 80, 75, 60};
        int[] alice = {50, 65, 77, 90, 102};
        System.out.println(Arrays.toString(climbingLeaderboard(scores, alice)));
    }
}
