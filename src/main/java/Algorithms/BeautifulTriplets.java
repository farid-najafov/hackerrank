package Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**https://www.hackerrank.com/challenges/beautiful-triplets/problem*/

public class BeautifulTriplets {
    static int beautifulTriplets(int d, int[] arr) {
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] - arr[i] != d) continue;
                for (int k = j + 1; k < arr.length; k++) {
                    count += arr[k] - arr[j] == d ? 1 : 0;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int[] data = {1, 6, 7, 7, 8, 10, 12, 13, 14, 19};
        System.out.println( beautifulTriplets(3, data) );
    }
}
