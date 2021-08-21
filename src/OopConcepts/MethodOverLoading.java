package OopConcepts;

public class MethodOverLoading {

	public static void main(String[] args) {

		MethodOverLoading Obj = new MethodOverLoading();
		Obj.Hello();
		Obj.Hello(10);
		Obj.Hello("Shari");
		Obj.Hello(10, 20);
		
		
	}
	
	
//	 we cannot use duplicate Method names or method within method
//	 Same method name with same number of paramerts are not allowed
//	 Method overloading--> When same Method name is used with different parameters/arguments in same class
//	 						we can create same method with same number of arguments but have to use different data types
//	 Method overloading is not possible by changing the return type of methods.
// It is used when we want to call same method name with different functionality	
//	 main method can also be overloaded
	
	public void Hello() {
		System.out.println("Method with no input");
		
		}
	
	public void Hello(int i) {
		System.out.println("Method with single input parameter");
		System.out.println(i);
		}
	public void Hello(String i) {
		System.out.println("Method with single input parameter but different data type");
		System.out.println(i);
		}
	
	public void Hello(int i, int j) {
		System.out.println("Method with two inputs parameters");
		System.out.println(i+j);
	}

	
}
