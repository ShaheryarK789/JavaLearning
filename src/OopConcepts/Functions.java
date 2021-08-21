package OopConcepts;

public class Functions {

	public static void main(String[] args) {
		
	Functions Obj = new Functions();
	// One Object is cretaed and Obj is the reference Variable to that object 
	// After creating that oject, copy of non static Methods is given to that object. 
	//Object cannot hold static Methods
	// if you want to call non static Methods, you have to create object
	
	//Functions.simple(); will not work for non static methods
	
	Obj.simple();
	int l =Obj.p();
	System.out.println(l);
	int k = Obj.Division(50, 2);
	System.out.println(k);
	
	// main method never returns anything so its always void
	}		
		
	
	//static methods
		
		public  void simple()  // void does not return anything  // No input No output
		{
			System.out.println("simple method");
		}

		public int p()  // return type Int //No input some output
		{
			int a=10;
			int b=20;
			int c = a+b;
			return c;
		}
		
		public int Division(int x, int y)  // some input and some output
		{
			int d = x/y;
			return d;

		}


}
