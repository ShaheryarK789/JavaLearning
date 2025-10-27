package OopConcepts;

//When Method names are same:
// Same parameters (number or type with same order) in same class is not allowed
// For same class or subclass ----Different parameters (number or type with same order) → Overloading
// For sub class --- Same parameters (number or type with same order) → Overriding


 class animal {

    public void eat ()
    {
        System.out.println("This is eat method of Parent");
    }

    public void run(){
        System.out.println("Run Method of Parent");
    }
}


 class dog extends animal{

    public void bark(){

        System.out.println("This is the Child method bark");
    }

        public void run(){
        System.out.println("Run Method of Child");
        }

}


public class OverrideMethodChild{
public static void main(String[] args)
{
    animal A = new animal();
    dog    D = new    dog();
    A.eat(); // Method of parent called
    D.bark(); // dog's own method
    D.eat(); // Method of parent called by child due to inheritence

    //overloading
    animal O = new dog();

  //  O.bark()   This will throw error as its reference of parent point to child which does not know child methods other than overridden ones.

     O.run();   // Overide: Run Method of child will execute
               /*  Now by creating normal parent object we use parent method functionality
                   But by creating reference of parent using overriding - we can call child method of same name and use its functionality 
    
 you can create a reference variable of a parent (superclass) and assign it an object of its child (subclass).
        This is called upcasting — a key part of runtime polymorphism.
        ✅ Syntax:
        Parent reference = new Child();    

  
        
        This way reusability - we just create only one object which is reference of parent and then call same method name of any sub classes at run time. 
        only child class methods will run.
        */

} 


}
       
      
       
  
