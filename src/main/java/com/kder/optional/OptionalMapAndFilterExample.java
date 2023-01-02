package com.kder.optional;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.List;
import java.util.Optional;

public class OptionalMapAndFilterExample {

    // Optional with filter example
    private static void optionalWithFilter(String value) {
        Optional<String> optionalVal = Optional.ofNullable(value);
        optionalVal.filter(val -> val.length() > 10)
                .ifPresent( val -> System.out.println(val + " length is greater than 10"));
    }

    public static void main(String[] args) {
        optionalWithFilter("Krishan");
        optionalWithFilter("Krishan Deo");
    }

}
