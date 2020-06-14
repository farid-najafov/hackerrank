package Algorithms.Implementation;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/cut-the-sticks/problem
 */
public class CutTheSticks {
    static int[] cutTheSticks(int[] arr) {
        int[] clone = arr.clone();
        List<Integer> list = new ArrayList<>() {{
            add(arr.length);
        }};
        for (int i = 0; i < arr.length; i++) {
            int min = Arrays.stream(clone).min().orElse(arr[0]);
            clone = Arrays.stream(clone).filter(x -> x != min).map(x -> x - min).toArray();
            list.add(clone.length);
        }
        return list.stream().mapToInt(i ->i).filter(i -> i != 0).toArray();
    }
    public static void main(String[] args) {
        int[] data = {141, 106, 156, 260, 860, 255, 449, 662, 428, 728, 136, 422, 534, 899, 233};
        System.out.println(Arrays.toString(cutTheSticks(data)));
    }
}
