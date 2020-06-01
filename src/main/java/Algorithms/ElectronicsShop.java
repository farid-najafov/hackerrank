package Algorithms;

import java.util.Arrays;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/electronics-shop/problem
 */
public class ElectronicsShop {
    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
        return IntStream.range(0, keyboards.length)
                .flatMap(i -> Arrays.stream(drives).map(drive -> keyboards[i] + drive))
                .boxed().collect(Collectors.toList())
                .stream().filter(i -> i <= b).max(Integer::compareTo).orElse(-1);
    }
    public static void main(String[] args) {
        int[] k = {3,1};
        int[] d = {5,2,8};
        System.out.println(getMoneySpent(k,d,10));
    }
}
