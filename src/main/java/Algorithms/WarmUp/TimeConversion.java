package Algorithms.WarmUp;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * https://www.hackerrank.com/challenges/time-conversion/problem
 */
public class TimeConversion {
    static String timeConversion(String s) {
        DateFormat df = new SimpleDateFormat("hh:mm:ssaa");
        DateFormat output= new SimpleDateFormat("HH:mm:ss");
        try {
            Date date = df.parse(s);
            return output.format(date);
        } catch (ParseException e) {
            return "smth went wrong";
        }
    }

    public static void main(String[] args) {
        String s = "07:05:45PM";
        System.out.println( timeConversion(s) );
    }
}
