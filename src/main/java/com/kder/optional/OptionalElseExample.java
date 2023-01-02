package com.kder.optional;

import java.util.Optional;

public class OptionalElseExample {

    // orElse
    private static Integer orElseExample(String value) {
        Optional<String> value1 = Optional.ofNullable(value);
        Integer len = value1.map(val -> val.length()).orElse(0);
        return len;
    }

    // orElseGet
    private static Integer orElseGetExample(String value) {
        Optional<String> value1 = Optional.ofNullable(value);
        return value1.map(val -> val.length()).orElseGet(() -> "Deo".length());
    }

    // orElseThrow
    private static Integer orElseThrowExample(String value) {
        Optional<String> value1 = Optional.ofNullable(value);
        return value1.map(val -> val.length()).orElseThrow(() -> new RuntimeException("Not a Valid!"));
    }

    public static void main(String[] args) {

        System.out.println("orElse (With Non-Null): " + orElseExample("Krishan"));
        System.out.println("orElse (With Null): " + orElseExample(null));

        System.out.println("orElseGet (With Non-Null): " + orElseGetExample("Krishan"));
        System.out.println("orElseGet (With Null): " + orElseGetExample(null));

        System.out.println("orElseThrow (With Non-Null): " + orElseThrowExample("Krishan"));
        System.out.println("orElseThrow (With Null): " + orElseThrowExample(null));

    }

}
