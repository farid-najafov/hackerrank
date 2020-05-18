package Algorithms;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**https://www.hackerrank.com/challenges/grading/problem*/

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream().map(
                x -> (x >= 38 && x % 5 >= 3) ? x + 5 - x % 5 : x
        ).collect(Collectors.toList());
    }

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(73, 67, 38, 33);
        System.out.println(list);
    }
}
