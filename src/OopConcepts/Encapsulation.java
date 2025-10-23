/*#1
What is encapsulation?
= binding data with method to make your program secure is known as encapsulation.
Consider encapsulation as we have capsule and inside capsule everything inside a class is wrapped or encapsulated.
e.g
class A{ private int a;  
public void setA(int num){a=num;} 
public int getA(){return a;}
} 
//here you can see that we can bind data with method inside a curly braces, it seems look like a capsule inside everything is present.

#2
how to achieve encapsulation?
-- through access specifiers private,protected,public,default . We can achieve 
encapsulation.

#3
Benefit of encapsulation
 i)Helpful in to achieve abstraction 
 ii)for security point of view it is most beneficial.
 iii)you can maintain log file through method when you bind your data with method.

#4
how to use private data?
-- using setters and getters method we can set and get the value of variable.
-- private int num;

 Note:
 Always make variable as private and method as public to achieve  security in program.

*/
class Human
{
	//int age;
	//private int age=11;
	private int age;
	//String name;
	//private String name="Navin";
	private String name;
	
	public int getAge()
	{
		return age;
	}
	public void SetAge(int a)
	{
		age=a;
	}
	
	
	public String getName()
	{
		return name;
	}
	public void setName(String n)
	{
		name=n;
	}
}

public class Demo {
	public static void main(String[] args) throws ClassNotFoundException
	{
		Human obj=new Human();
		obj.SetAge(30);
		obj.setName("Reddy");
//		obj.age=11;
//		obj.name="Navin";
		
		System.out.println(obj.getName()+" : "+obj.getAge());
	
	}
}
