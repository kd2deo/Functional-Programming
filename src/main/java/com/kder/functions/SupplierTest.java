package com.kder.functions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

public class SupplierTest {

    public static void main(String[] args) {
        System.out.println(getName.get());
        System.out.println(getListOfName.get());
    }

    static Supplier<String> getName = () -> "Krishan";

    static Supplier<List<String>> getListOfName = () -> List.of("Krishan", "Deo");

}
