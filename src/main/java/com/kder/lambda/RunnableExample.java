package com.kder.lambda;

public class RunnableExample {

    public static void main(String[] args) {

        // Prior to Java 8 (With Anonymous Class)
        Runnable runnable = new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Example Prior to Java8");
            }
        };
        new Thread(runnable).start();

        // With Lambda (Java8)
        Runnable runnableWithLambda = () -> {
            System.out.println("Runnable Example With Java8");
        };
        new Thread(runnableWithLambda).start();

        // With Lambda, Single Line Body (Java8)
        Runnable runnableWithSingleLineBody = () -> System.out.println("Runnable Example With Java8 Single Line Body");
        new Thread(runnableWithSingleLineBody).start();

        // With Lambda, Writing inside method arguments (Java8)
        new Thread(() -> System.out.println("With Lambda, Writing inside method arguments")).start();

    }

}
