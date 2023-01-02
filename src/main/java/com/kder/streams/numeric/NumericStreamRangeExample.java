package com.kder.streams.numeric;

import java.util.stream.IntStream;
import java.util.stream.LongStream;

public class NumericStreamRangeExample {

    public static void main(String[] args) {

        // IntStream.range -> 1, 2, 3, ...., 9
        IntStream.range(1, 10).forEach(val -> System.out.print(val + " "));

        System.out.println();

        // IntStream.rangeClosed -> 1, 2, 3, ...., 10
        IntStream.rangeClosed(1, 10).forEach(val -> System.out.print(val + " "));

        System.out.println();

        // LongStream.range -> 1, 2, 3, ...., 9
        LongStream.range(1, 10).forEach(val -> System.out.print(val + " "));

        System.out.println();

        // LongStream.rangeClosed -> 1, 2, 3, ...., 10
        LongStream.rangeClosed(1, 10).forEach(val -> System.out.print(val + " "));

        System.out.println();

        // Double Stream doesn't support range and rangeClose, however, we can do this
        // using IntStream.rangeClosed(1, 10).asDoubleStream()
        IntStream.rangeClosed(1, 10).asDoubleStream().forEach(val -> System.out.print(val + " "));

    }

}
