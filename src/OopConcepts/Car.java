package OopConcepts;


public class Car {
		
	//class variables
	
	int model;
	int wheel;

	public static void main(String[] args) {
		
		// new Car()   --- > new object of Car class
		// new keyword is used to create oject
		// a,b ---> Oject Reference variable of the class
		
		Car a = new Car();
		Car b = new Car();
		
		a.model=2015; a.wheel=4;
		System.out.println(a.model +" " + a.wheel);
		
		
		
	}

}