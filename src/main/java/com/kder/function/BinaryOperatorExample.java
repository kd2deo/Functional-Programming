package com.kder.function;

import java.util.function.BinaryOperator;

public class BinaryOperatorExample {

    static BinaryOperator<Integer> sumOfTwoNum = (num1, num2) -> num1 + num2;

    public static void main(String[] args) {

        System.out.println("Sum of Two Number: " + sumOfTwoNum.apply(10, 20));

    }

}
