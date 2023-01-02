package com.kder.streams.numeric;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.IntStream;

public class NumericStream {

    //
    private static int sumOfNumbers(List<Integer> numbers) {
        return numbers.stream()
                .reduce(0, (num1, num2)  -> num1 + num2); // Will perform Unboxing each time Integer to int
    }

    private static int sumOfRange() {
        return IntStream.rangeClosed(1, 5).sum(); // Unboxing not required
    }


    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        System.out.println(sumOfNumbers(list));
        System.out.println(sumOfRange());
    }


}
