package xjava;

import java.util.Arrays;

public class Solution {
    static int formingMagicSquare(int[][] s) {
        return Arrays.stream(s).flatMapToInt(Arrays::stream).sum();

    }

    public static void main(String[] args) {
        int[][] data = {
                {5, 3, 4},
                {1, 5, 8},
                {6, 4, 2}
        };
        System.out.println(formingMagicSquare(data));
    }
}