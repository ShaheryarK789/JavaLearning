
/*The static keyword in Java is used for memory management mainly. 
 * We can apply static keyword with variables, methods, blocks and nested classes. 
 * The static keyword belongs to the class than an instance of the class.
 * The static variable can be used to refer to the common property of all objects 
 * (which is not unique for each object), for example, the company name of employees, college name of students, etc.
 *	The static variable gets memory only once in the class area at the time of class loading.
 */

package OopConcepts;

public class StaticAndNonStatic {
	

	String name = "Ali";  //non static Global var
	static int  age=10;	 // Static Global var

	public static void main(String[] args) {

		// Static Method and var calling
		//1- Direct Calling
		System.out.println(age);
		sum();
		//2-Calling by class name
		System.out.println(StaticAndNonStatic.age);
		StaticAndNonStatic.sum(); 
		
		
		//Non Static Method and Var calling 
		StaticAndNonStatic Obj = new StaticAndNonStatic();
		System.out.println(Obj.name);
		Obj.hello();
		
		System.out.println(Obj.age);  //  Static can be called by Obj but not recommended
		
		
		
	}  
	
	
	public void hello()		//non static method
	{
	System.out.println("non static Method is Hello");	
	
	}
	
	public static void sum() // static method
	{
	System.out.println("Static Method is Sum");	
	}

}
