package com.kder.streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;

public class FlatMapTest {

    public static void main(String[] args) {

        flatMapTest();
    }

    private static void flatMapTest() {

        List<List<Integer>> listOfList = Arrays.asList(
            Arrays.asList(1, 2, 3),
            Arrays.asList(4, 5, 6),
            Arrays.asList(7, 8, 9)
        );

        List<Integer> flatList = listOfList.stream().flatMap(list -> list.stream()).collect(Collectors.toList());

        List<Integer> flatList2 = listOfList.stream().flatMap(Collection::stream).collect(Collectors.toList());

        System.out.println(flatList);
        System.out.println(flatList2);




    }

}
