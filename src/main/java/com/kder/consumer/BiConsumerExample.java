package com.kder.consumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {

    // Simple BiDirectional to Print both Arguments
    static BiConsumer<Integer, Integer> display = (val1, val2) -> {
        System.out.println("Value1: " + val1 + " Value2: " + val2);
    };

    static BiConsumer<Integer, Integer> multiply = (val1, val2) -> {
        System.out.println("Multiplication: " + (val1 * val2));
    };

    static BiConsumer<Integer, Integer> division = (val1, val2) -> {
        System.out.println("Division: " + (val1 / val2));
    };

    public static void main(String[] args) {

        int val1 = 10;
        int val2 = 20;

        display.accept(val1, val2);

        multiply.accept(val1, val2);

        division.accept(val2, val1);

        multiply.andThen(division).accept(val2, val1);

    }

}
