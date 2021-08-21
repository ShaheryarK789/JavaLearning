package OopConcepts;

public class OverrideAnnotationAndSuper {

	
//	what is @Override

	/* We write @Override before the overridden method: over ridden method is the same method name of child class
	 * and parent class.
	 * child class always overrides parent class so we can use this annotation for 2 reasons.
	
	1) It improves the readability of the code. 
	2) If programmer makes any mistake such as Change method name, 
	 change parameter types while overriding, it will show a compile time error. 
	 Like it says it is overriding method & changes will impact etc
	 
	 */
	public static void main(String[] args) throws InterruptedException {
		
		
		OverrideMethodParent p = new OverrideMethodParent();
		p.car();
		
		System.out.println("==========================");
		OverrideMethodChild c = new OverrideMethodChild();
		c.car();  // this is overroding
		
		
		//when parent class reference is using child class obj then method overridden is called
		
		
		OverrideMethodParent PC = new OverrideMethodChild();
		PC.car();
		
	}
	
	/*Super keyword
	
	1) super is used to refer immediate parent class instance variable.
	2) super can be used to invoke parent class method
	3) super is used to invoke parent class constructor.
	*/
}
