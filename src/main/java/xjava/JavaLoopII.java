package xjava;

import java.util.Scanner;

/**https://www.hackerrank.com/challenges/java-loops/problem*/

public class JavaLoopII {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int r = 0;
            for (int j = 0; j < n; j++) {
                r = (int) Math.pow(2, j) * b + r;
                System.out.print(a + r + " ");
            }
            System.out.println();
        }
    }
}
