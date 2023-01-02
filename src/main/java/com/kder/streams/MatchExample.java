package com.kder.streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class MatchExample {

    // Find if all elements greater and equal to 10
    // allMatch -> boolean allMatch(Predicate<? super T> var1);
    private static final Function<List<Integer>, Boolean> allMatchFunction = (values) -> values.stream()
            .allMatch(val -> val >= 10);

    // Find if any of elements in list greater than 35
    // anyMatch -> boolean anyMatch(Predicate<? super T> var1);
    private static final Function<List<Integer>, Boolean> anyMatchFunction = (values) -> values.stream()
            .anyMatch(val -> val >= 35);

    // Find if none of elements greater and equal to 60
    // noneMatch -> boolean noneMatch(Predicate<? super T> var1);
    private static final Function<List<Integer>, Boolean> noneMatchFunction = (values) -> values.stream()
            .noneMatch(val -> val >= 60);

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(10, 20, 30, 40, 50);

        System.out.println("Find if all elements greater and equal to 10: " + allMatchFunction.apply(list));
        System.out.println("Find if any of elements in list greater than 35: " + anyMatchFunction.apply(list));
        System.out.println("Find if none of elements greater and equal to 60: " + noneMatchFunction.apply(list));

    }

}
