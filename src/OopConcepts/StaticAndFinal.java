package OopConcepts;

public class StaticAndFinal {
/*
 In Java, static keyword is mainly used for memory management. 
  It can be used with variables, methods, blocks and nested classes. 
  It is a keyword which is used to share the same variable or method of a given class. Basically, 
  static is used for a constant variable or a method that is same for every instance of a class
 When a variable is declared as static, then a single copy of variable is created and shared among all objects at class level. 
  
  ✅ 5. For final, static, private methods → no overriding.
  Single webdriver variable is used among all classes with the program is example of static variable
  */
	
/*	
	Final keyword:
	
	stop Value change
	stop overriding
	stop inheritence	
variables, ref variables, arrays can be final

*/
   
    { System.out.println("Instance Block"); }
     static { System.out.println("Static Block"); }
   StaticAndFinal() { System.out.println("Constructor"); }
}
public class ConstructorLiterals {
    public static void main(String[] args) {
        new StaticAndFinal();
    }
}

// when printing Static block will run 1st, the, instace block and then constructor block
