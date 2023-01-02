package com.kder.function;

import java.util.function.Function;

public class FunctionInterfaceExample {

    // Upper Case of String
    static Function<String, String> toUpper = (value) -> value.toUpperCase();

    // Length of String
    static Function<String, Integer> lengthOfString = (value) -> value.length();

    public static void main(String[] args) {

        System.out.println("Upper Case: " + toUpper.apply("Krishan"));

        System.out.println("Length is: " + lengthOfString.apply("Krishan"));

        System.out.println("andThen() Example: " + toUpper.andThen(lengthOfString).apply("Krishan"));

        System.out.println("compose() Example: " + lengthOfString.compose(toUpper).apply("Krishan"));

    }

}
