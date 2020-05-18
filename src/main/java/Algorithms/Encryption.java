package Algorithms;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**https://www.hackerrank.com/challenges/encryption/problem*/

public class Encryption {
    public static String encryption(String s) {
        int len = s.length();
        double l = Math.sqrt(len);
        int l1 = (int) Math.floor(l);
        int l2 = (int) Math.ceil(l);
        int cols = l2;
        int rows = l1 == l2 ? l1 : l1 * l2 < len ? l2 : l1;

        return IntStream.range(0, cols).boxed().flatMap(c ->
                IntStream.range(0, rows).boxed().map(r -> {
                    // index in original string
                    int idx = r * cols + c;
                    // char
                    String ch = idx < len ? String.valueOf(s.charAt(idx)) : "";
                    // we are at the last row
                    return r == rows-1 ? ch+" " : ch;
                })
        ).collect(Collectors.joining());
    }

    public static void main(String[] args) {
        String s = "haveaniceday";
        System.out.println(encryption(s));
    }
}
