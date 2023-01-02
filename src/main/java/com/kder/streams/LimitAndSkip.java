package com.kder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

public class LimitAndSkip {

    // Limit: Take First two elements and sum it
    // limit -> Stream<T> limit(long var1);
    private static final Function<List<Integer>, Optional<Integer>> limitFunction = (values) -> values.stream()
            .limit(2)
            .reduce(Integer::sum);

    // Skip First Two Elements and Sum Others
    // skip -> Stream<T> skip(long var1);
    private static final Function<List<Integer>, Optional<Integer>> skipFunction = (values) -> values.stream()
            .skip(2)
            .reduce(Integer::sum);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        Optional<Integer> skipTest = skipFunction.apply(list);
        skipTest.ifPresent((value) -> System.out.println("Skip First Two Elements and Sum Others: " + value));

        Optional<Integer> limitTest = limitFunction.apply(list);
        limitTest.ifPresent((value) -> System.out.println("Skip First Two Elements and Sum Others: " + value));

    }

}
