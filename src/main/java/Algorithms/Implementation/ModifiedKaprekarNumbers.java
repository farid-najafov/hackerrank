package Algorithms.Implementation;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/kaprekar-numbers/problem
 */
public class ModifiedKaprekarNumbers {
    static boolean isKaprekar(int i) {
        int len = String.valueOf(i).length();
        long pow = (long) Math.pow(i, 2);
        String ns = String.valueOf(pow);
        String s1 = ns.substring(0, ns.length() - len);
        String s2 = ns.substring(ns.length() - len);
        int i1 = s1.isEmpty() ? 0 : Integer.parseInt(s1);
        int i2 = Integer.parseInt(s2);
        return i1 + i2 == i;
    }
    static void kaprekarNumbers(int p, int q) {
        String collect = IntStream.rangeClosed(p, q).filter(i-> isKaprekar(i))
                .mapToObj(String::valueOf).collect(Collectors.joining(" "));
        System.out.println( !collect.isEmpty() ? collect : "INVALID RANGE" );
    }
    public static void main(String[] args) {
        kaprekarNumbers(1, 99999);
    }
}
