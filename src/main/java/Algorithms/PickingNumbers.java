package Algorithms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

/**https://www.hackerrank.com/challenges/picking-numbers/problem*/

public class PickingNumbers {
    public static int pickingNumbers(List<Integer> a) {
        List<List<Integer>> lists = new ArrayList<>();
        Collections.sort(a);

        IntStream.range(0, a.size()-1).forEach(i -> {
            List<Integer> list = new ArrayList<>();
            list.add(a.get(i));
            IntStream.range(i+1, a.size()).forEach(j -> {
                if (Math.abs(a.get(i)-a.get(j)) <= 1)
                    list.add(a.get(j));
            });
            lists.add(list);
        });

        return lists.stream().mapToInt(List::size).max().orElse(-1);
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,6,5,3,3,1);
        System.out.println(pickingNumbers(list));
    }
}
