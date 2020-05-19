package xjava;

import jdk.dynalink.linker.LinkerServices;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    static int[] cutTheSticks(int[] arr) {
        int[] clone = arr.clone();
        List<Integer> list = new ArrayList<>(){{
            add(arr.length);
        }};

        for (int i = 0; i < clone.length+2; i++) {
            int min = Arrays.stream(clone).min().orElse(arr[0]);
            clone = Arrays.stream(clone).filter(x -> x != min).map(x -> x - min).toArray();
            list.add(clone.length);
            System.out.println(Arrays.toString(clone));
        }


        return list.stream().mapToInt(i ->i).filter(i -> i != 0).toArray();
    }
    public static void main(String[] args) {
        int[] data = {1, 1, 1};

        System.out.println(Arrays.toString(cutTheSticks(data)));
    }
}