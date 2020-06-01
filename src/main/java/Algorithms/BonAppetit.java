package Algorithms;

import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/bon-appetit/problem
 */
public class BonAppetit {
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int share = (bill.stream().mapToInt(i -> i).sum() - bill.get(k)) / 2;
        System.out.println(share == b ? "Bon Appetit" : b - share);
    }
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(3, 10, 2, 9);
        bonAppetit(list, 1, 7);
    }
}
