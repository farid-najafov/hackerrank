package InterviewPreparationKit.StringManipulation;

import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings
 */
public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        return (int) IntStream.range(0, s.length() - 1).filter(i -> s.charAt(i) == s.charAt(i + 1)).count();
    }

    public static void main(String[] args) {
        String s = "AAAA";
        System.out.println( alternatingCharacters(s) );
    }
}
