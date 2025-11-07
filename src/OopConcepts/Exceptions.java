/* Simple definition:

An Exception is an object that represents an error or unexpected event during program execution.

⚙️ Why use exceptions?

Exceptions help you:

Handle runtime errors gracefully.

Prevent program crashes.

Keep code clean and readable using try-catch blocks.

🧩 Types of Exceptions in Java

Java exceptions are divided mainly into three categories:

1️⃣ Checked Exceptions (Compile-Time Exceptions)

Checked at compile time.

Must be handled using try-catch or declared using throws.

Typically occur in I/O, database, or network operations.

Examples:
/*
import java.io.*;

public class CheckedExample {
    public static void main(String[] args) {
        try {
            FileReader file = new FileReader("abc.txt"); // File might not exist
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        }
    }
}


🧩 Common Checked Exceptions:

IOException

FileNotFoundException

SQLException

ClassNotFoundException

2️⃣ Unchecked Exceptions (Runtime Exceptions)

Checked at runtime.

Usually caused by programming mistakes.

You don’t have to handle them explicitly.

Examples:

public class UncheckedExample {
    public static void main(String[] args) {
        int a = 10 / 0; // ArithmeticException
        int[] arr = {1, 2, 3};
        System.out.println(arr[5]); // ArrayIndexOutOfBoundsException
    }
}


🧩 Common Unchecked Exceptions:

ArithmeticException

NullPointerException

ArrayIndexOutOfBoundsException

NumberFormatException

IllegalArgumentException

3️⃣ Errors (Serious system-level issues)

These are not exceptions but fatal conditions.

The program cannot recover from them.

Not meant to be caught normally.

Examples:

public class ErrorExample {
    public static void main(String[] args) {
        // Recursion without base case
        main(args); // StackOverflowError
    }
}


🧩 Common Errors:

StackOverflowError

OutOfMemoryError

VirtualMachineError
