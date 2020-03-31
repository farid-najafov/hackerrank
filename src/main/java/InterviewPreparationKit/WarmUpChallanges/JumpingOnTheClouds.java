package InterviewPreparationKit.WarmUpChallanges;


public class JumpingOnTheClouds {
    static int jumping(int[] data) {
        int jumps = -1;
        int i = 0;
        while (i < data.length) {
            if (i < data.length - 2 && data[i + 2] == 0) {
                i++;
            }
            i++;
            jumps ++;
        }
        return jumps;
    }

    public static void main(String[] args) {
        int[] ints = {0, 0, 0, 1, 0, 0};
        System.out.println( jumping(ints) );
    }
}
