package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class CountingTerminalExample {

    private static final Supplier<Long> numOfEmployee = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .collect(Collectors.counting());
    };

    public static void main(String[] args) {
        System.out.println(numOfEmployee.get());
    }

}
