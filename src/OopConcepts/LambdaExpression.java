/*
A lambda expression is a short way to write anonymous methods (functions) — i.e., methods without a name or a class.
Syntax of a Lambda Expression

Basic form:
(parameters) -> expression

Multiple statements
(parameters) -> {
    // body of method
}

A lambda can only be used with a functional interface.
  */


// Below are two functions - one to print hello world and 2nd to add 2 numbers.

@FunctionalInterface
interface Printer {
    void print();
}

@FunctionalInterface
interface Adder {
    int add(int a, int b);
}

public class Lambda {
    public static void main(String[] args) {
        // 1️⃣ Lambda to print "Hello World"
        Printer printer = () -> System.out.println("Hello World");
        printer.print();

        // 2️⃣ Lambda to add two numbers
        Adder adder = (a, b) -> a + b;
        int result = adder.add(10, 20);
        System.out.println("Sum: " + result);
    }
}
