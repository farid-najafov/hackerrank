package InterviewPreparationKit.Arrays;

import java.util.ArrayList;
import java.util.List;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=arrays
 */
public class HourglassSum {
    static int hourglassSum(int[][] arr) {
        int max;
        int sum;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            for (int j = 0; j < arr[i].length - 2; j++) {
                sum = arr[i][j] + arr[i][j+1] + arr[i][j+2] + arr[i+1][j+1] + arr[i+2][j] + arr[i+2][j+1] + arr[i+2][j+2];
                list.add(sum);
            }
        }
        max = list.stream().max(Integer::compareTo).orElseThrow(() -> new RuntimeException("nope"));
        return max;
    }

    public static void main(String[] args) {
        int[][] data = new int[6][6];
        for (int i = 0; i <data.length ; i++) {
            for (int j = 0; j < data[i].length ; j++) {
                System.out.print(data[i][j] = (int) (Math.random() * 10));
                System.out.print(" ");
            }
            System.out.println();
        }

        System.out.println(hourglassSum(data));

    }
}
