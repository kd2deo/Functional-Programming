package com.kder.function;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {

    static UnaryOperator<Integer> multiplyBy10 = (num) -> num * 10;

    static UnaryOperator<String> toUpperCase = (value) -> value.toUpperCase();

    public static void main(String[] args) {

        System.out.println("Multiply By 10: " + multiplyBy10.apply(10));

        System.out.println("Upper Case: " + toUpperCase.apply("Krishan"));

    }

}
