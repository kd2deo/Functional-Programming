package com.kder.functions;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class ConsumerTest {

    public static void main(String[] args) {

        Customer customer = new Customer("Krishan", "95901726");
        // Normal Function
        greetCustomer(customer);

        // Lambda
        greetCustomerFunction.accept(customer);

        greetCustomerFunction2.accept(customer, false);

    }

    static Consumer<Customer> greetCustomerFunction = customer -> System.out.println(
        "Hello " + customer.name + ", your number registered " + customer.number);

    static BiConsumer<Customer, Boolean> greetCustomerFunction2 = (customer, showNumber) -> System.out.println(
        "Hello " + customer.name + ", your number registered " + (showNumber ? customer.number : "*****"));

    static private void greetCustomer(Customer customer) {
        System.out.println("Hello " + customer.name + ", your number registered " + customer.number);
    }

    static class Customer {

        private final String name;
        private final String number;

        public Customer(String name, String number) {
            this.name = name;
            this.number = number;
        }

        public String getName() {
            return name;
        }

        public String getNumber() {
            return number;
        }

    }

}
