package Algorithms;

/**
 * https://www.hackerrank.com/challenges/strange-advertising/problem
 */
public class ViralAdvertising {
    static int viralAdvertising(int n) {
        int acc = 0;
        int p = 5;
        for (int i = 0; i < n; i++) {
            p = Math.floorDiv(p, 2);
            acc += p;
            p *= 3;
        }
        return acc;
    }
    public static void main(String[] args) {
        System.out.println(viralAdvertising(5));
    }
}
