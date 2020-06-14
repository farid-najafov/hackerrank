package Algorithms.Implementation;

/**
 * https://www.hackerrank.com/challenges/minimum-distances/problem
 */
public class MinimumDistances {
    static int minimumDistances(int[] a) {
        int dis = a.length;
        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] == a[j]) {
                    if (dis > j - i) {
                        dis = j - i;
                        break;
                    }
                }
            }
        }
        return dis != a.length ? dis : -1;
    }
    public static void main(String[] args) {
        int[] data = {7, 1, 3, 4, 1, 7};
        System.out.println(minimumDistances(data));
    }
}
