

An Exception is an object that represents an error or unexpected event during program execution.

⚙️ Why use exceptions?

Exceptions help you:

Handle runtime errors gracefully.

Prevent program crashes.

Keep code clean and readable using try-catch blocks.

🧩 Types of Exceptions in Java
 Summary of Differences
Feature                    	Handled (Checked) Exceptions                            	Unhandled (Unchecked) Exceptions
Checked                                at	Compile time	                                 Run time
Handling                            enforced?	Yes, must be caught or declared	No,        optional handling
Source of issue                  	Anticipated external conditions	               Programming errors/logic bugs
Recovery                        	Often recoverable	Usually                     fatal for the current operation
Key examples	                   IOException, SQLException	                    NullPointerException, ArithmeticException

Java exceptions are divided mainly into three categories:

1️⃣ Checked Exceptions (Compile-Time Exceptions)

Checked at compile time.

Must be handled using try-catch or declared using throws.

Typically occur in I/O, database, or network operations.

Examples:

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

//Nullpointer exception:

class Student {
    String name;
    void printName() {
        System.out.println(name.toUpperCase()); // ❌ If name is null, NPE occurs
    }
}

public class TestNull {
    public static void main(String[] args) {
        Student s = new Student(); // created but name = null
        s.printName();  // ❌ Causes NullPointerException
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

/****************************************************/
    What is Optional in Java?

Optional<T> is a container class introduced in Java 8.
It can hold either a value of type T or no value (i.e., null).

It helps you avoid NullPointerException by making the presence or absence of a value explicit.

🧠 Simple definition:

Optional is a wrapper around an object that may or may not be null.

✅ Example 1: Without Optional (Old way)
public class WithoutOptional {
    public static void main(String[] args) {
        String name = null;

        if (name != null) {
            System.out.println(name.toUpperCase());
        } else {
            System.out.println("Name is missing!");
        }
    }
}


❌ This requires manual null checks. Forgetting one can lead to NullPointerException.

✅ Example 2: With Optional (Safe way)
import java.util.Optional;

public class WithOptional {
    public static void main(String[] args) {
        Optional<String> name = Optional.ofNullable(null);

        // Print default if name is null
        System.out.println(name.orElse("Unknown User")); // Output: Unknown User
    }
}
/****************************Throw & Throws****************************************/


1️⃣ throw keyword
💡 Used to manually throw an exception in Java.
You use it inside a method or block to create and throw an exception object.

✅ Example:
public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Not eligible to vote"); // manually thrown
        }
        System.out.println("You can vote!");
    }}
🧠 Explanation:

throw keyword is used to create and throw an exception object manually.
You can only throw one exception at a time.
The thrown exception can be checked or unchecked, depending on the exception type.
In the example, ArithmeticException is an unchecked (runtime) exception.

⚙️ 2️⃣ throws keyword
💡 Used to declare exceptions that a method might throw — not to actually throw them.
Placed after the method signature, it warns the caller that the method may cause an exception.

✅ Example (Checked Exception):
import java.io.*;

public class ThrowsExample {
    static void readFile() throws IOException {
        FileReader file = new FileReader("abc.txt"); // may cause FileNotFoundException
        file.read();
        file.close();
    }

    public static void main(String[] args) {
        try {
            readFile();
        } catch (IOException e) {
            System.out.println("File handling error: " + e.getMessage());
        }
    }
}

🧠 Explanation:

throws IOException tells the compiler that readFile() might throw a checked exception.
The caller (main method) must handle it using try-catch.

    Keyword	Function	                Checked/Unchecked	                    Used For
throw	Actually throws an exception	        Both	            Inside method
throws	Declares an exception	        Usually checked                	In method declaration
