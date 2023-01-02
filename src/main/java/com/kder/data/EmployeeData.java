package com.kder.data;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class EmployeeData {

    public static Supplier<List<Employee>> getAllEmployee = () -> Arrays.asList(
            new Employee(101, "Ram", Employee.Gender.MALE, "Bangalore", "KA", "IN", "IT", 52000, Arrays.asList("Cricket", "Volleyball", "Music")),
            new Employee(102, "Shyam", Employee.Gender.MALE, "Delhi", "Delhi", "IN", "Account", 15000, Arrays.asList("Cricket", "Dancing")),
            new Employee(103, "Ramesh", Employee.Gender.MALE, "Bangalore", "KA", "IN", "Admin", 56000, Arrays.asList("Music", "Volleyball", "Music")),
            new Employee(104, "Sib", Employee.Gender.FEMALE, "Gurgaon", "HR", "IN", "Admin", 59000, Arrays.asList("Swimming", "Volleyball")),
            new Employee(105, "Shukla", Employee.Gender.MALE, "Jaipur", "RJ", "IN", "Account", 25000, Arrays.asList("Badminton", "Volleyball", "Music")),
            new Employee(106, "Sony", Employee.Gender.FEMALE, "Patna", "BR", "IN", "IT", 35000, Arrays.asList("Cricket", "Volleyball")),
            new Employee(107, "Frank", Employee.Gender.MALE, "NY", "NY", "US", "IT", 58000, Arrays.asList("Cricket", "Volleyball", "Music")),
            new Employee(108, "Katty", Employee.Gender.FEMALE, "California", "Los Angeles", "US", "Admin", 51000, Arrays.asList("Cricket", "Badminton")),
            new Employee(109, "Thea", Employee.Gender.FEMALE, "California", "Los Angeles", "US", "IT", 50000, Arrays.asList("Cricket", "Volleyball")),
            new Employee(110, "Sara", Employee.Gender.FEMALE, "California", "Los Angeles", "US", "Admin", 45000, Arrays.asList("Cricket", "Volleyball", "Music")),
            new Employee(111, "Tom", Employee.Gender.MALE, "NY", "NY", "US", "Account", 35000, Arrays.asList("Badminton", "Swimming")),
            new Employee(112, "Thomas", Employee.Gender.OTHER, "NY", "NY", "US", "Admin", 65000, Arrays.asList("Swimming", "Volleyball", "Music")),
            new Employee(113, "Adam", Employee.Gender.MALE, "California", "Los Angeles", "US", "Account", 55000, Arrays.asList("Swimming", "Badminton", "Music"))
    );

}
