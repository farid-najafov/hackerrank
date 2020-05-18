package InterviewPreparationKit.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MinimumSwaps2 {
    static int minimumSwaps(int[] arr) {
        boolean[] isVisited = new boolean[arr.length + 1];

        Map<Integer, Integer> map = IntStream.range(1, isVisited.length).boxed()
                .collect(Collectors.toMap(k -> k, v -> arr[v - 1]));

        int count = 0;
        for (int i = 1; i <= map.size(); i++) {
            int next;
            if (!isVisited[i]) {
                isVisited[i] = true;
                if (i != map.get(i)) {
                    int curr = map.get(i);
                    while (!isVisited[curr]) {
                        isVisited[curr] = true;
                        next = map.get(curr);
                        curr = next;
                        ++count;
                    }
                }
            }
        }
        return count;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 5, 2, 4, 6, 7};  // output 3;

        System.out.println( minimumSwaps(data) );

    }
}
