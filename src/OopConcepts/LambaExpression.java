package OopConcepts;

import java.util.ArrayList;
import java.util.function.Consumer;

//Lambda Expressions were added in Java 8.


public class LambaExpression {

	public static void main(String[] args) {

/*	1-	A lambda expression is a short block of code which takes in parameters and returns a value. 
*		Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method.
*  		(parameter1, parameter2) -> { code block }
*/		ArrayList Ar = new ArrayList();
		
		Ar.add(1);
		Ar.add(10); 
		Ar.add(100);
		Ar.forEach ((n)-> {System.out.println("output is: "+n);});
		
/* 2- Lambda expressions can be stored in variables if the variable's type is an interface which has only one method. 
 *    The lambda expression should have the same number of parameters and the same return type as that method. 
 *    Java has many of these kinds of interfaces built in, such as the Consumer interface (found in the java.util package) used by lists.
 		Lambda expression helps us to write our code in functional style. 
 		It provides a clear and concise way to implement SAM interface(Single Abstract Method) by using an expression. 
 		It is very useful in collection library in which it helps to iterate, filter and extract data.
*/		ArrayList<Integer> numbers = new ArrayList<Integer>();
	    numbers.add(5);
	    numbers.add(9);
	    numbers.add(8);
	    numbers.add(1);
	    Consumer<Integer> method = (n) -> { System.out.println(n); };
	    numbers.forEach( method );
		
	}
}
