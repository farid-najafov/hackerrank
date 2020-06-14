package Algorithms.Implementation;

import java.util.Arrays;
import java.util.function.IntPredicate;

/**
 * https://www.hackerrank.com/challenges/apple-and-orange/problem
 */
public class AppleAndOrange {
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        IntPredicate p = x -> x >= s && x <= t;
        long ac = Arrays.stream(apples).map(x -> x + a).filter(p).count();
        long oc = Arrays.stream(oranges).map(x -> x + b).filter(p).count();
        System.out.printf("%d\n%d", ac, oc);
    }

    public static void main(String[] args) {
        countApplesAndOranges(5, 15, 3, 2, new int[]{-2, 2, 1}, new int[]{5, -6});
    }
}
