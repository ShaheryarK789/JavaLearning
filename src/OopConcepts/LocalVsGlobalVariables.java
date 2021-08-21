package OopConcepts;

public class LocalVsGlobalVariables {
	
	String NAME="Ali" ;   //Class variable or Global variable

	public static void main(String[] args) {
		
		String X ="kk";   // local variable
		
		//System.out.println(name); Global variables cannot be accessed like this
		//To access non static Global variable create object ref
		
		LocalVsGlobalVariables Obj = new LocalVsGlobalVariables(); 
		
		System.out.println(Obj.NAME);
	}

	
	public void local() {
	
		int Y=10;		// local variable
	}
}
