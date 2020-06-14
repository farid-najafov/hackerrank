package Algorithms.Implementation;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * https://www.hackerrank.com/challenges/permutation-equation/problem
 */
public class SequenceEquation {
    static int[] permutationEquation(int[] p) {
        int len = p.length;
        int[] result = new int[len];
        List<Integer> list = Arrays.stream(p).boxed().collect(Collectors.toList());
        for(int i = 1; i <= len; i++) {
            result[i-1] =  list.indexOf(list.indexOf(i) + 1) + 1;
        }
        return result;
    }
    public static void main(String[] args) {
        int[] data = {4, 3, 5, 1, 2};
        System.out.println(Arrays.toString(permutationEquation(data)));
    }
}
