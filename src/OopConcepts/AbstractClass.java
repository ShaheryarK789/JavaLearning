/*  Abstract vs Inheritence
🏗️ Inheritance is the mechanism (how a child class gets stuff from a parent).
🎭 Abstract class is a type of parent class that provides incomplete design functionality to be finished by child classes.
	 Why WebDriver is an interface and not an abstract class?
     You can easily switch from Chrome to Firefox without changing your core logic — just create a new subclass.
Abstract:
 An abstract class is a parent class that cannot be instantiated (you can’t create its object directly).
It is meant to be inherited and completed by child classes.
It’s used for abstraction — hiding implementation and showing only the structure. 
Add abstract keyword for class and its methods, use extends keyword for subclasses.
if we remove abstract keywords and add method body in abstract method of animal then this will work as override*/
 
 

abstract class animal{

    abstract void makesound( String S);  // it has no body, must be overridden. incompleted definition, competed by child
    void eat (){
        System.out.println("Eat method of parent/abstract class");
    }
}

class dog extends animal {

    void bark(){
        System.out.println("Bark method of Child");}
    void makesound(String K){
        System.out.println("making sound from dog using abstraction: "+ K);}

}

class cat extends animal {
    void makesound(String K){
        System.out.println("Making sound of Cat using abstraction: "+ K);
    }
}

public class AbstractClass{
public static void main (String[] args){

//  animal A = new animal();  // not possible - abstract class is not instantiated
    animal D = new dog ();    // create reference of parent pointing to child then use methods of parent
    D.makesound("Woof");            // overridden child method in case of reference parent. 
    D.eat();                  // parent class method


    animal C = new cat();
    C.makesound("meaow");

}

}
