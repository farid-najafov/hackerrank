package Algorithms;

/**https://www.hackerrank.com/challenges/taum-and-bday/problem*/

public class TaumAndBDay {
    public static long taumBday(int b, int w, int bc, int wc, int z) {
        return (long) b * Math.min(bc, wc + z) + (long) w * Math.min(wc, bc + z);
    }

    public static void main(String[] args) {
        System.out.println(taumBday(10, 10, 1, 1, 1));
    }
}
