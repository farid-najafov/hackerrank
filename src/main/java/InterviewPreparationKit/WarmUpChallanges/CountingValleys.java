package InterviewPreparationKit.WarmUpChallanges;

/**
 * https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValleys {
    static int countingValleys(String s) {
        int valleys = 0;
        int steps = 0;
        for (int i = 0; i < s.length(); i++) {
            switch (s.charAt(i)) {
                case 'U': steps++; break;
                case 'D': steps--; break;
            }
            if (steps == 0 && s.charAt(i) == 'U') valleys++;
        }
        return valleys;
    }

    public static void main(String[] args) {
        int valleys =  countingValleys("DDUUDDUDUUUD");
        System.out.println(valleys);
    }
}
