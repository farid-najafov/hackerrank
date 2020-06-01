package InterviewPreparationKit.Arrays;

import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/ctci-array-left-rotation/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class LeftRotation {
    static int[] rotLeft(int[] a, int d) {
        List<Integer> list = Arrays.stream(a).boxed().collect(Collectors.toList());
        for (int i = 0; i < d; i++) {
            list.add(list.get(0));
            list.remove(0);
        }
        return list.stream().mapToInt(integer -> integer).toArray();
    }

    public static void main(String[] args) {
        int[] data = new Random().ints(0,10).limit(5).toArray();
        data = new int[]{1, 2, 3, 4, 5};
        System.out.println(Arrays.toString(data));
        System.out.println(Arrays.toString(rotLeft(data, 4)));
    }
}
