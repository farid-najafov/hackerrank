package Algorithms;

import java.util.Arrays;

/**https://www.hackerrank.com/challenges/manasa-and-stones/problem*/

public class ManasaAndStones {
    static int[] stones(int n, int a, int b) {
        int[] ints = new int[n];
        for (int i = 0, j = n - 1; i < n; i++, j--) {
            ints[i] = i * a + j * b;
        }
        return Arrays.stream(ints).distinct().sorted().toArray();
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(stones(4, 10, 100)));
    }
}
