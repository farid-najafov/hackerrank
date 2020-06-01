package Algorithms;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/fair-rations/problem
 */
public class FairRations {
    static int fairRations(int[] B) {
        if (Arrays.stream(B).sum() % 2 != 0) return -1;

        int cnt = 0;
        for (int i = 0; i < B.length; i++) {
            if(B[i] % 2 != 0) {
                B[i+1] += 1;
                cnt += 2;
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        int[] data = {2, 3, 4, 5, 6};
        System.out.println(fairRations(data));
    }
}
