package com.kder.optional;

import com.kder.data.Employee;
import com.kder.data.EmployeeData;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class OptionalExample {

    private static Optional<List<String>> getEmpHobbiesByHighestSalary() {

        List<Employee> employees = EmployeeData.getAllEmployee.get();
        Optional<Employee> max = employees.stream()
                .max(Comparator.comparing(Employee::getCountry));

        if (max.isPresent()) {
            return Optional.ofNullable(max.get().getHobbies());
        }

        return Optional.empty();
    }

    public static void main(String[] args) {

        Optional<List<String>> empHobbiesByHighestSalary = getEmpHobbiesByHighestSalary();
        empHobbiesByHighestSalary.ifPresent(System.out::println);

    }

}
