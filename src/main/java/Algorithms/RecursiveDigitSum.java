package Algorithms;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * https://www.hackerrank.com/challenges/recursive-digit-sum/problem
 */
public class RecursiveDigitSum {
    static int superDigit(String n, int k) {
        return  n.length() == 1 ? Integer.parseInt(n) :
                superDigit(String.valueOf(n.chars().mapToLong(i -> i - '0').sum() * k), 1);
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("input07.txt"));
        String s = br.readLine();
        System.out.println(superDigit(s, 100000));
    }
}
