package Algorithms;

import java.util.Arrays;

/**
 * https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
 */
public class BreakingTheRecords {
    static int[] breakingRecords(int[] scores) {
        int min = scores[0];
        int max = scores[0];
        int minCnt = 0;
        int maxCnt = 0;

        for (int i = 1; i < scores.length; i++) {
            if (scores[i] < min) {
                min = scores[i];
                minCnt++;
            }
            if (scores[i] > max) {
                max = scores[i];
                maxCnt++;
            }
        }
        return new int[]{maxCnt, minCnt};
    }
    public static void main(String[] args) {
//        int[] data = {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
        int[] data = {10, 5, 20, 20, 4, 5, 2, 25, 1};
        System.out.println(Arrays.toString(breakingRecords(data)));
    }
}
