package OOPS_FULL.Encapsulation;

import OOPS_FULL.*;
import StreamAPi_JAVA.Employee;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void main(String[] args) {
        List<Mobile> mobiledata = Arrays.asList(
                new Mobile("IQOO", "blue", 8, 27000),
                new Mobile("MI", "RED", 8, 20000),
                new Mobile("APPLE 15", "Black", 12, 150000),
                new Mobile("APPLE 12", "White", 8, 84000));

        // for (Mobile m : mobiledata) {
        // System.out.println(m.getName() + " " + m.getColor() + " " + m.getRam() + " "
        // + m.getPrice());
        // }

        // using streams and optional class

        Optional<Mobile> maxPrice = mobiledata.stream()
                .max(Comparator.comparing(Mobile::getPrice));
        // System.out.println(maxPrice);

        // sorting based on price
        List<Mobile> orderPrice = mobiledata.stream()
                .sorted((a, b) -> Integer.compare(a.getPrice(), b.getPrice()))
                .toList();

        // System.out.println(orderPrice);

        // second highest mobile
        Mobile secondhighest = mobiledata.stream()
                .sorted((a, b) -> Integer.compare(b.getPrice(), a.getPrice()))
                .skip(1)
                .findFirst()
                .get();

        System.out.println(secondhighest);

    }

}
