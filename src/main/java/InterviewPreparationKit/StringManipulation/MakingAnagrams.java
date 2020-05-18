package InterviewPreparationKit.StringManipulation;

/**https://www.hackerrank.com/challenges/ctci-making-anagrams/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=strings*/

public class MakingAnagrams {
    static int makeAnagram(String a, String b) {

        int count = 0;
        for (int i = 0; i < a.length(); i++) {
            String rem = a.substring(i, i+1);
            if (b.contains(rem)) {
                b = b.replaceFirst(rem, "");
                count++;
            }
        }
        return a.length() + b.length() - count;
    }

    public static void main(String[] args) {
        String a = "cde";
        String b = "abc";
        System.out.println( makeAnagram(a, b) );
    }
}
