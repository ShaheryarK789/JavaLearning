/**

When we create an object of a class that it calls the constructor of a sub-class as well as a constructor of a superclass.
But if you pass the value in an object, then it will call the parameterised constructor of that class.

Super() method:-
Every constructor in Java has a method, even if you do not mention it.
By default, the first statement in every constructor is a method called a super() method.
Super() method means calls the constructor of a superclass.
If you do not pass any parameter in a super method, then it will call the default constructor of a superclass.
If you pass any parameter in a super method, then it will call the parameterised constructor of a superclass.
To call the parameterised constructor of a parent class, we need to explicitly call the super method.

// super()
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}
class B extends A
{
	public B()
	{
//		super();
		super(5);
		System.out.println("in B");
	}
	public B(int n)
	{
//		super();   //call default constructor of super class
		super(n);
		System.out.println("in B int");
	}
}
public class Demo {
	public static void main(String[] args) 
	{
		
		B obj=new B();
//		B obj=new B(5);
	}
}
**/


//this() 
class A
{
	public A() 
	{
		super();
		System.out.println("in A");
	}
	public A(int n)
	{
		super();
		System.out.println("in A int");
	}
}

class B extends A
{
	public B()
	{
		super();
		System.out.println("in B");
	}
	public B(int n)
	{
		//this();  //call constructor of same class
		System.out.println("in B int");
	}
}
public class SuperKeyword {
	public static void main(String[] args) 
	{
		
//		B obj=new B();
		B obj1=new B(5);
	}
}
