package com.kder.streams.numeric;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class NumericStreamBoxingUnboxing {

    static List<Integer> boxing() {
        return IntStream.rangeClosed(1, 10)
                .boxed() // Convert int to Stream<Integer>
                .collect(Collectors.toList());
    }

    static int unboxing(List<Integer> list) {
        return list.stream()
                .mapToInt(Integer::intValue) // Convert to IntStream
                .sum();
    }

    public static void main(String[] args) {
        List<Integer> boxing = boxing();
        System.out.println("Boxing: " + boxing);
        System.out.println("Unboxing: " + unboxing(boxing));
    }

}
