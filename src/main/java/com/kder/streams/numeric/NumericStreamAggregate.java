package com.kder.streams.numeric;

import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class NumericStreamAggregate {

    public static void main(String[] args) {

        // sum()
        int sum = IntStream.rangeClosed(1, 10).sum();
        System.out.println(sum);

        // min()
        OptionalInt min = IntStream.rangeClosed(1, 400).min();
        if (min.isPresent()) {
            System.out.println(min.getAsInt());
        }

        // max()
        OptionalInt max = IntStream.rangeClosed(1, 400).max();
        if (max.isPresent()) {
            System.out.println(max.getAsInt());
        }

        // average()
        OptionalDouble average = IntStream.rangeClosed(1, 10).average();
        if (average.isPresent()) {
            System.out.println(average.getAsDouble());
        }

    }

}
