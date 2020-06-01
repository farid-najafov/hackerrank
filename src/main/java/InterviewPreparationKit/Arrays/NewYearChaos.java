package InterviewPreparationKit.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class NewYearChaos {
    static void minimumBribes(int[] q) {

    }

    public static void main(String[] args) {
        int[] data = new Random().ints(1,6).distinct().limit(5).toArray();
        System.out.println(Arrays.toString(data));
        minimumBribes(data);
    }
}