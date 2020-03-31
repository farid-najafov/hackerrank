package InterviewPreparationKit.WarmUpChallanges;

public class RepeatedString {
    static long repeatedString(String s, long n) {
        long count = 0;
        for(int i=0; i < s.length(); i++){
            if(s.charAt(i) == 'a')
                count++;
        }

        long div = n / s.length();
        long reminder = n % s.length();

        count = div*count;

        for(int i=0; i < reminder; i++){
            if(s.charAt(i) == 'a')
                count++;
        }
        return count;
    }

    public static void main(String[] args) {
        String s = "aba";
        System.out.println( repeatedString(s, 11) );
    }
}
