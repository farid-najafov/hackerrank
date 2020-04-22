package InterviewPreparationKit.Arrays;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**https://www.hackerrank.com/challenges/new-year-chaos/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays*/

public class NewYearChaos {
    static void minimumBribes(int[] q) {

    }

    public static void main(String[] args) {
        int[] data = IntStream.rangeClosed(1,5).boxed().sorted((o1, o2) -> new Random().nextInt())
                .mapToInt(a -> a).toArray();
        System.out.println(Arrays.toString(data));
        minimumBribes(data);
    }
}