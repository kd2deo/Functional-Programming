package com.kder.supplier;

import java.util.UUID;
import java.util.function.Supplier;

public class SupplierExample {

    static Supplier<String> uniqueID = () -> UUID.randomUUID().toString();

    public static void main(String[] args) {

        System.out.println("Unique ID: " + uniqueID.get());

    }

}
