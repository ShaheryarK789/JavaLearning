package OopConcepts;

public class MethodMain {

	public static void main(String[] args) {
		
		
		/* Method overriding--> when same Method name is present is Parent class as well as Child Class
						with same number of Arguments/parameters is called --> Method overriding
						Preference will be given to overridden Method (Child class method)

		Method overloading--> When same Method name is used with different parameters/arguments in same class
					we can create same method with same number of arguments but have to use different data types
		 */
		
		
		OverrideMethodChild Obj = new OverrideMethodChild();
		Obj.car();  // This is Method Overridden   // compile time polymorphism OR Static polymorphism
		
		Obj.P();	// access parent class methods from child class obj ref / it can even access grand parent class object
		Obj.C();
		
		
		OverrideMethodParent Obj1 = new OverrideMethodParent();
		Obj1.car();
		Obj1.P();
		//Obj1.C()   this child method cannot be accessed from Parent class obj.. offcourse
		// parent cannot inhert any property (method or var) from child class
		
		
		
		//Top casting
		OverrideMethodParent p1 = new OverrideMethodChild();  //Dynamic Polymorphism: child class object referenced by parent calls ref variable
		//Dynamic Polymorphism or Run-time polymorphism
		//only parent class methods and overridden method of chile class can be called no other child class method
		p1.car();
		p1.P();
		//Obj1.C()   this child method cannot be accessed

		//Down Casting
		//OverrideMethodChild ch =new OverrideMethodParent();  //Not possible

		/*		Advantage of method overriding
		The main advantage of method overriding is that the class can give its own specific implementation to a inherited method without even modifying the parent class code.

		This is helpful when a class has several child classes, so if a child class needs to use the parent class method, it can use it and the other classes that want to have different implementation can use overriding feature to make changes without touching the parent class code.	
	*/	
	}

}
