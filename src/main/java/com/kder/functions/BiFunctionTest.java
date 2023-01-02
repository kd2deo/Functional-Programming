package com.kder.functions;

import java.util.function.BiFunction;

public class BiFunctionTest {

    public static void main(String[] args) {

        Integer result = incByOneThenMulByNumberFunction.apply(1, 10);
        System.out.println("BiFunctionTest Result: " + result);

    }

    static BiFunction<Integer, Integer, Integer> incByOneThenMulByNumberFunction =
            (num, mulByNum) -> (num + 1) * mulByNum;

}
