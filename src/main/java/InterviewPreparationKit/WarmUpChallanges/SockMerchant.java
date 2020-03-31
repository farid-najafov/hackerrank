package InterviewPreparationKit.WarmUpChallanges;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

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
