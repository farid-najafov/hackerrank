package InterviewPreparationKit.Arrays;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**https://www.hackerrank.com/challenges/crush/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays*/

public class ArrayManipulation {
    static long arrayManipulation(int n, int[][] queries) {
//        List<Integer> list = IntStream.generate(() -> 0).limit(n).boxed().collect(Collectors.toList());
        List<Integer> list = IntStream.rangeClosed(0, n).map(i -> 0).boxed().collect(Collectors.toList());
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> finalList = new ArrayList<>();
        for (int[] query : queries) {
            int a = query[0];
            int b = query[1];
            int k = query[2];

            Integer[] arr = list.toArray(new Integer[0]);

            List<Integer> subList = list.subList(a, b + 1).stream().map(x -> x + k).collect(Collectors.toList());

            List<Integer> inter = new ArrayList<Integer>(Arrays.asList(arr)) {{
                addAll(a - 1, subList);
            }};

            lists.add(inter);
        }
        for (int i = 0; i < n ; i++) {
            int d = 0;
            for (int k = 0; k < queries.length ; k++) {
                d += lists.get(k).get(i);
            }
            finalList.add(d);
        }
        return finalList.stream().max(Integer::compareTo).orElseThrow(() -> new RuntimeException("smth went wrong"));
    }

    public static void main(String[] args) {
        int[][] data = {
                {1, 2, 100},
                {2, 5, 100},
                {3, 4, 100},
        };
//        int[][] data = {
//                {2, 6, 8},
//                {3, 5, 7},
//                {1, 8, 1},
//                {5, 9, 15}
//        };

        System.out.println( arrayManipulation(5, data) );
    }
}
