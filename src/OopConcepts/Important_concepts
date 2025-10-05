
Compile time VS Run time Errors

Error Type	    Example	              Description
Compile-time	  int x = "Java";	      Type mismatch detected by compiler
Compile-time	                        Missing semicolon	Syntax error
Run-time	      10 / 0	              ArithmeticException
Run-time	      null.length()	        NullPointerException
Run-time	      Integer.parseInt("abc")	NumberFormatException

***************** try catch****************88
try {
    // Code that might cause an exception
} catch (ExceptionType e) {
    // Code to handle the exception
}


--------------
public class Example1 {
    public static void main(String[] args) {
        try {
            int a = 10, b = 0;
            int result = a / b;  // ❌ This causes ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Cannot divide by zero!");
        }

        System.out.println("Program continues normally...");
    }
}
------------------------

Keyword	        Purpose
try          	Defines code that might throw an exception
catch        	Handles the specific exception
finally	      Always runs after try/catch, for cleanup tasks
throw	        Manually throw an exception
throws	      Declares exceptions a method can throw



Difference Between throw and throws
Keyword	                    Used For	                              Used In	                                    Purpose
throw	            To manually throw an exception	        Inside a method or block	        Creates and throws an exception object
throws	            To declare that a method might            In a method signature            Passes the responsibility of handling the exception to the caller
                    throw an exception		

🧩 1️⃣ Example of throw

throw is used inside a method or block to explicitly raise an exception.

public class ThrowExample {
    public static void main(String[] args) {
        int age = 15;

        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be at least 18 years old.");
        } else {
            System.out.println("Access granted!");
        }
    }
}


🧠 Explanation:

The program manually throws an ArithmeticException when age < 18.

The program stops immediately when the exception is thrown (unless caught with try-catch).


🧩 2️⃣ Example of throws

throws is used in the method declaration to tell the caller that this method might throw an exception.

public class ThrowsExample {
    // Method declares that it may throw an exception
    static void checkFile() throws java.io.IOException {
        throw new java.io.IOException("File not found!");
    }

    public static void main(String[] args) {
        try {
            checkFile();  // Calling method that throws exception
        } catch (java.io.IOException e) {
            System.out.println("Caught Exception: " + e.getMessage());
        }

        System.out.println("Program continues normally...");
    }
}


🧠 Explanation:

checkFile() declares throws IOException, meaning it might throw this exception.

The caller (main) must handle it using try-catch or declare throws IOException itself.
