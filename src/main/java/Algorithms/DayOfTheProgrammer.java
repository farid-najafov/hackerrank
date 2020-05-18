package Algorithms;

/**https://www.hackerrank.com/challenges/day-of-the-programmer/problem*/

public class DayOfTheProgrammer {
    static boolean isLeapYear(int year) {
        return  (year < 1918 && year % 4 == 0) ||
                (year > 1918 && year % 400 == 0 || year % 4 == 0 && year % 100 != 0);
    }

    static String dayOfProgrammer(int year) {
        if (year == 1918) return "26.09.1918";
        return isLeapYear(year) ? String.format("12.09.%s", year) : String.format("13.09.%s", year);
    }

    public static void main(String[] args) {
        int year = 2016;
        System.out.println(dayOfProgrammer(year));
    }
}
