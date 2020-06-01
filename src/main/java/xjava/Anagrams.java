package xjava;

import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/java-anagrams/problem?h_r=next-challenge&h_v=zen
 */
public class Anagrams {
    static boolean isAnagram(String a, String b) {
        if (a.length() != b.length()) return false;

        List<Character> ca = a.codePoints().mapToObj(i -> (char) i).collect(Collectors.toList());
        List<Character> cb = b.codePoints().mapToObj(i -> (char) i).collect(Collectors.toList());

        for (int i = 0; i < a.length(); i++) {
            cb.remove(ca.get(i));
        }

        return cb.isEmpty();
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
