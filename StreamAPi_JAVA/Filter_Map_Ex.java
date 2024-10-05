package StreamAPi_JAVA;

//a)select only passed students and grace the 5 marks for failed students

import java.util.*;

import javax.swing.event.ListDataEvent;

public class Filter_Map_Ex {

    public static void main(String[] args) {

        List<Integer> marks = Arrays.asList(21, 32, 34, 70, 80, 90);

        List<Integer> paasedMarks = marks.stream()
                .filter(i -> i > 35)
                .toList();

        System.out.println(paasedMarks);

        List<Integer> graceMarks = marks.stream()
                .filter(i -> i < 35)
                .map(i -> i + 5)
                .toList();

        System.out.println(graceMarks);

    }

}
