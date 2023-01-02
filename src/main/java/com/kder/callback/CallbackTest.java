package com.kder.callback;

import java.util.function.Consumer;

public class CallbackTest {

    public static void main(String[] args) {

        hello("Krishan", null, value -> System.out.println("Last Name not provided for " + value));

        hello2("Krishan", null, () -> System.out.println("Last Name not provided "));

    }

    static void hello(String firstName, String lastName, Consumer<String> callback) {
        System.out.println("First Name: " + firstName);
        if(lastName != null) {
            System.out.println("Last Name: " + lastName);
        } else {
            callback.accept(firstName);
        }
    }

    static void hello2(String firstName, String lastName, Runnable callback) {
        System.out.println("First Name: " + firstName);
        if(lastName != null) {
            System.out.println("Last Name: " + lastName);
        } else {
            callback.run();
        }
    }

}
