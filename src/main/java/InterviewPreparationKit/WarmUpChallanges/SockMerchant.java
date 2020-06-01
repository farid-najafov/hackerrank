package InterviewPreparationKit.WarmUpChallanges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 * https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class SockMerchant {
    static int sockMerchant(int[] ar) {
        Set<Integer> set = new HashSet<>();
        int pairs = 0;
        for (int value : ar) {
            if (!set.contains(value)) {
                set.add(value);
            } else {
                set.remove(value);
                pairs++;
            }
        }
        return pairs;
    }

    public static void main(String[] args){
        int[] arr = new Random().ints(1, 20).limit(20).toArray();
        System.out.println(Arrays.toString(arr));
        System.out.println(sockMerchant(arr));

    }
}
