package com.kder.data;

import java.util.List;

public class Employee {

    private int empId;
    private String name;
    private Gender gender;
    private String city;
    private String state;
    private String country;
    private String department;
    private int salary;
    private List<String> hobbies;

    public Employee() {}

    public Employee(int empId, String name, Gender gender, String city, String state, String country, String department, int salary, List<String> hobbies) {
        this.empId = empId;
        this.name = name;
        this.gender = gender;
        this.city = city;
        this.state = state;
        this.country = country;
        this.department = department;
        this.salary = salary;
        this.hobbies = hobbies;
    }

    public int getEmpId() {
        return empId;
    }

    public String getName() {
        return name;
    }

    public Gender getGender() {
        return gender;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getCountry() {
        return country;
    }

    public String getDepartment() {
        return department;
    }

    public int getSalary() {
        return salary;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "empId=" + empId +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", department='" + department + '\'' +
                ", salary=" + salary +
                ", hobbies=" + hobbies +
                '}';
    }

    enum Gender {
        MALE,
        FEMALE,
        OTHER
    }

}
