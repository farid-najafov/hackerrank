package xjava;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/java-string-reverse/problem
 */

public class StringReverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        int i = 0;
        int last = A.length() - 1;
        boolean flag = false;
        while (A.charAt(i) == A.charAt(last)) {
            i++;
            last--;
            if (i >= last) {
                System.out.println("Yes");
                flag = true;
                break;
            }
        }
        if (!flag) System.out.println("No");

    }

}
