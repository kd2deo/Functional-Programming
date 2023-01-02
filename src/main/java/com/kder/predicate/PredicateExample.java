package com.kder.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    // Is Age >= 18
    static Predicate<Integer> canVote = (age) -> age >= 18;

    // Number is Even?
    static Predicate<Integer> isEven = (number) -> number % 2 == 0;

    // Number is Divisible By 10
    static Predicate<Integer> isDivisibleBy10 = (number) -> number % 10 == 0;

    public static void main(String[] args) {

        System.out.println("Can Vote: " + canVote.test(18));

        System.out.println("Is Even: " + isEven.test(16));

        System.out.println("Is Divisible By 10: " + isDivisibleBy10.test(100));

        // And Method
        System.out.println("Even and Divisible By 10: " + isEven.and(isDivisibleBy10).test(200));
        // Or Method
        System.out.println("Even and Divisible By 10: " + isEven.or(isDivisibleBy10).test(8));
        // Negate
        System.out.println("Negate of Even: " + isEven.negate().test(10));

    }

}
