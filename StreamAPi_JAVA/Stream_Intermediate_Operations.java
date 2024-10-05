package StreamAPi_JAVA;

import java.util.*;

public class Stream_Intermediate_Operations {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(2, 3, 4, 6, 5);

        List<Integer> filteredList = list.stream().filter(i -> i % 2 == 0).toList();
        System.out.println("/Filter() method is used to filter the elements:");
        System.out.println(filteredList);

        List<Integer> transformedMap = list.stream()
                .map(i -> i * 2)
                .toList();

        System.out.println("MaP() function is used to  transform the data");
        System.out.println(transformedMap);

    }

}
