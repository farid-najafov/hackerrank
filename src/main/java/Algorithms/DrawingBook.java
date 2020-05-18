package Algorithms;

/**https://www.hackerrank.com/challenges/drawing-book/problem*/

public class DrawingBook {
    static int pageCount(int n, int p) {
        int pages = n/2;
        int turn = p/2;
        return (turn > pages/2) ? pages - turn : turn;
    }
    public static void main(String[] args) {
        System.out.println( pageCount(6, 2) );
    }
}
