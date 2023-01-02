package com.kder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class FilterTest {

    public static void main(String[] args) {
        filterListGreaterThan10();
    }

    private static void filterListGreaterThan10() {

        List<Integer> list = Arrays.asList(9, 6, 13, 34, 56, 5, 10, 4, 90);

        List<Integer> greaterThan10 = list.stream().filter(value -> value >= 10).collect(Collectors.toList());
        System.out.println(greaterThan10);

        // Get First Element from Stream
        Optional<Integer> first = list.stream().filter(value -> value >= 10).findFirst();
        System.out.println(first.get());

        // Convert into Array
        Object[] objects = list.stream().filter(val -> val < 10).toArray();
        System.out.println(objects);


    }

}
