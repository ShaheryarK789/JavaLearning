package OopConcepts;

public class CallbyValueAndCallbyRef {
	
	int p;

	public static void main(String[] args) {
		
		
		int x=10;
		int y=20;
		
		CallbyValueAndCallbyRef Obj = new CallbyValueAndCallbyRef();
		System.out.println(Obj.sum(x,y));  //Call by Value OR Pass by Value
		System.out.println(Obj.sum(10,5));
		//since after calling function the values are changing and new values are 10 and 50 so result will be 60
		// bt it will not affect the original variable values in x and y i.e 10 and 20
		
		
		Obj.p=1000; // to use in ref later
	}

	public int sum(int a, int b)
	{
		 a=10;
		 b=50;
		int c= a+b;
		return c;
	}
	
	
	
	
	
	public void call(CallbyValueAndCallbyRef F)
	{
		int w= F.p; // this calling by Ref
		
		
		
	}
	
}
