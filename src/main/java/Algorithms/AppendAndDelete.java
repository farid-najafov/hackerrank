package Algorithms;

/**https://www.hackerrank.com/challenges/append-and-delete/problem*/

public class AppendAndDelete {
    static String appendAndDelete(String s, String t, int k) {
        int i = 0;
        while (i < Math.min(s.length(), t.length())) {
            if (s.charAt(i) != t.charAt(i)) break;
            i++;
        }
        int x = k - (s.length() + t.length() - 2 * i);

        if(x == 0) {
            return "Yes";
        }
        else if(x < 0) {
            return "No";
        }
        else {
            return x % 2 != 0 && x < (2 * i) ? "No" : "Yes";
        }
    }

    public static void main(String[] args) {
        String s = "hackerhappy";
        String t = "hackerrank";
        System.out.println( appendAndDelete(s, t, 9) );
    }
}
