package com.kder.streams;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Stream;

public class StreamOperation {

    public static void main(String[] args) {

        // Stream.of
        Stream<String> ofExample = Stream.of("A", "B", "C");
        ofExample.forEach(System.out :: println);

        // Stream.iterate
        Stream.iterate(1, x -> x + 1)
                .limit(10)
                .forEach(System.out::println);

        // Stream.generate
        Supplier<Integer> random = new Random()::nextInt;
        Stream.generate(random)
                .limit(10)
                .forEach(System.out::println);

    }

}
