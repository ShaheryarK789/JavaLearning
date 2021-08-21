package OopConcepts;

//To overcome any error on method over ridden we use @method Override annotation

public class OverrideMethodChild extends OverrideMethodParent{
	
	@Override
	public void car()  // Over-ridden Method
	{
		
		System.out.println("Child Car Method");
	}
	
	public void C()
	{
		System.out.println("Chile class method C");
		
		OverrideMethodParent p = new OverrideMethodParent();
		p.car();
		
		OverrideMethodChild c = new OverrideMethodChild();
		c.car();
	}
	
	
}
