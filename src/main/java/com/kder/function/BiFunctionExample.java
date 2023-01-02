package com.kder.function;

import java.util.function.BiFunction;
import java.util.function.Function;

public class BiFunctionExample {

    // Sum of two Number
    static BiFunction<Integer, Integer, Integer> sumOfTwoNum = (num1, num2) -> num1 + num2;

    // Division of two Number
    static BiFunction<Integer, Integer, Float> divOfTwoNum = (num1, num2) -> ((float)num1 / num2);

    // Multiplication andThen divByTwo (Chaining example)
    static BiFunction<Integer, Integer, Integer> mulOfTwoNum = (num1, num2) -> num1 * num2;
    static Function<Integer, Integer> divByTwo = (num) -> num / 2;

    public static void main(String[] args) {

        System.out.println("Sum: " + sumOfTwoNum.apply(10, 20));

        System.out.println("Division: " + divOfTwoNum.apply(20, 10));

        System.out.println("Chaining: " + mulOfTwoNum.andThen(divByTwo).apply(10, 20));

    }

}
