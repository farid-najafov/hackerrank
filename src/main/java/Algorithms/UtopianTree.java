package Algorithms;

import java.util.stream.IntStream;

/**hackerrank.com/challenges/utopian-tree/problem*/

public class UtopianTree {
    static class Result {
        int x = 0;
    }
    static int utopianTree(int n) {
        Result r = new Result();
        return IntStream.rangeClosed(0, n).map(i -> {
            r.x = i % 2 == 0 ? r.x + 1 : r.x * 2;
            return r.x;
        }).max().orElseThrow(RuntimeException::new);
    }

    static int utopianTree2(int n) {
        int x = 0;
        for (int i = 0; i <= n ; i++) {
            x = i % 2 == 0 ? x + 1 : x * 2;
        }
        return x;
    }
    public static void main(String[] args) {
        System.out.println(utopianTree(5));
    }
}
