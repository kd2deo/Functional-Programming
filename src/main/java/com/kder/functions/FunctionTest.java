package com.kder.functions;


import java.util.function.Function;

public class FunctionTest {

    public static void main(String[] args) {

        Integer incByTwo = FunctionTest.incrementByTwoFunction.apply(1);
        Integer mulByTwo = FunctionTest.multiplyByTwoFunction.apply(incByTwo);
        System.out.println("Increment By Two Result: " + incByTwo);
        System.out.println("Increment By Two then Multiply by Two: " + mulByTwo);

        // Chaining
        Function<Integer, Integer> incByTwoThenMulByTwoFunction = incrementByTwoFunction.andThen(multiplyByTwoFunction);
        Integer result = incByTwoThenMulByTwoFunction.apply(1);
        System.out.println("Increment By Two then Multiply by Two: " + result);

    }

    // Lamda expression to add number by two
    static Function<Integer, Integer> incrementByTwoFunction = number -> number + 2;

    // Lamda expression to multiply by two
    static Function<Integer, Integer> multiplyByTwoFunction = number -> number * 2;


}
