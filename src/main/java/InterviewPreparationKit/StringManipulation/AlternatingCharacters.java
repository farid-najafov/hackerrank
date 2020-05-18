package InterviewPreparationKit.StringManipulation;

/**https://www.hackerrank.com/challenges/alternating-characters/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings*/

public class AlternatingCharacters {
    static int alternatingCharacters(String s) {
        int count = 0;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "AAAA";
        System.out.println( alternatingCharacters(s) );
    }
}
