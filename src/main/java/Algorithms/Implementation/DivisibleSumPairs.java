package Algorithms.Implementation;

/**
 * https://www.hackerrank.com/challenges/divisible-sum-pairs/problem
 */
public class DivisibleSumPairs {
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int count = 0;
        for (int i = 0; i < ar.length; i++) {
            for (int j = i + 1; j < ar.length; j++) {
                count += (ar[i] + ar[j]) % k == 0 ? 1 : 0;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] data = {1, 3, 2, 6, 1, 2};
        System.out.println( divisibleSumPairs(6, 3, data) );
    }
}
