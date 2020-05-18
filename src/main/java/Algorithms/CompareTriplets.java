package Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**https://www.hackerrank.com/challenges/compare-the-triplets/problem*/

public class CompareTriplets {
    static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int al = 0;
        int bob = 0;
        for (int i = 0; i < a.size(); i++) {
            if (a.get(i) > b.get(i)) al++;
            if (a.get(i) < b.get(i)) bob++;
        }
        return Arrays.asList(al, bob);
    }

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(17, 28, 30);
        List<Integer> b = Arrays.asList(99, 16, 8);
        System.out.println( compareTriplets(a, b) );
    }
}
