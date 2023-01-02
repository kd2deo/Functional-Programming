package com.kder.functions;

import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        boolean test = isValidPhoneNumber.test("+911234567890");
        System.out.println("Is Valid Number: " + test);

        boolean test1 = isValidPhoneNumber.and(isContainsZero).test("+911234567890");
        System.out.println(test1);

        boolean test2 = isValidPhoneNumber.or(isContainsZero).test("+911234567894");
        System.out.println(test2);

    }

    static Predicate<String> isValidPhoneNumber = phoneNumber -> phoneNumber.startsWith("+91") && phoneNumber.length() == 13;

    static Predicate<String> isContainsZero = phoneNumber -> phoneNumber.contains("0");

}
