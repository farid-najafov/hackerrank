package Algorithms.WarmUp;

import java.util.Arrays;
import java.util.IntSummaryStatistics;

/**
 * https://www.hackerrank.com/challenges/mini-max-sum/problem
 */
public class MiniMaxSum {
    static void miniMaxSum(int[] arr) {
        IntSummaryStatistics stat = Arrays.stream(arr).summaryStatistics();
        System.out.printf("%d %d", stat.getSum() - stat.getMax(), stat.getSum() - stat.getMin());
    }

    public static void main(String[] args) {
        int[] data = {1, 2, 3, 4, 5};
        miniMaxSum(data);
    }
}
