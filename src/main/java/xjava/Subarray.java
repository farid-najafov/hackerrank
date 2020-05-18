package xjava;

/**https://www.hackerrank.com/challenges/java-negative-subarray/problem*/

public class Subarray {
    public static void main(String[] args) {
        int[] data = {1, -2, 4, -5, 1};
        int count = 0;

        for (int i = 0; i < data.length; i++) {
            int sum = 0;
            for (int j = i; j < data.length; j++) {
                sum += data[j];
                if (sum < 0) count++;
            }
        }
        System.out.println(count);
    }
}
