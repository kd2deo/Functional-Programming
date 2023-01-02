package com.kder.optional;

import java.util.Optional;

public class OptionalPractice {

    public static void main(String[] args) {

        Object value = Optional.ofNullable(null).orElse("Else Value");
        System.out.println(value);

    }

}
