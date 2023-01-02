package com.kder.predicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    static BiPredicate<Integer, Integer> isFirstValueGreaterThanValue = (val1, val2) -> val1 > val2;

    public static void main(String[] args) {

        System.out.println("Is First Value Greater than Second Value: " + isFirstValueGreaterThanValue.test(20, 10));

    }

}
