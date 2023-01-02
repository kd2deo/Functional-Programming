package com.kder.streams.terminal;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class JoiningTerminalExample {

    // Collectors.joining() -> Will Join all name
    private static final Supplier<String> empNameJoining = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining());
    };

    // Collectors.joining(" ") -> With space delimiter
    private static final Supplier<String> getEmpNameJoiningWithSpace = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(" "));
    };

    // Collectors.joining(" ", "[", "]") -> With prefix and suffix
    private static final Supplier<String> getGetEmpNameJoiningWithSuffixNPrefix = () -> {
        List<Employee> employees = EmployeeData.getAllEmployee.get();
        return employees.stream()
                .map(Employee::getName)
                .collect(Collectors.joining(" ", "[", "]"));
    };

    public static void main(String[] args) {
        System.out.println(empNameJoining.get());
        System.out.println(getEmpNameJoiningWithSpace.get());
        System.out.println(getGetEmpNameJoiningWithSuffixNPrefix.get());
    }

}
