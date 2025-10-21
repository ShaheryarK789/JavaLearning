//Why the reference type matters when creating objects

//The type of reference determines what members (methods/variables) you can access.


class Animal {
    void sound() { System.out.println("Animal sound"); }
}

class Dog extends Animal {
    void bark() { System.out.println("Dog barks"); }
    void tail() { System.out.println("move tail");}
}

public class ParentChildObjExample {
    public static void main(String[] args) {
        Animal a = new Dog();  // Superclass reference
            a.sound();             // ✅ Allowed
            // a.bark();           // ❌ Not allowed (Animal reference doesn’t know bark()) parent cannt access child
            // Only a child object (or parent reference pointing to a child object) can access overridden parent methods (via polymorphism)
        Dog d = new Dog();     // Subclass reference
            //  d.sound();            // ✅ Allowed
                d.bark();             // ✅ Allowed
                d.tail();             // ✅ Allowed
    }
}

/*
🧩 Why?
Because the reference type (Animal) decides what you can see at compile time,
and the object type (Dog) decides what actually happens at runtime.

✅ Summary Table
Concept	                 Example	                        Purpose
Object creation	        new Student();	            Creates the object in memory
Reference variable  	Student s;	                Stores the address of that object
Reference + Object	    Student s = new Student();	Lets you use methods/data
No reference	        new Student();	            Object is unreachable and soon garbage collected
Superclass reference, subclass object	Animal a = new Dog();	Enables polymorphism

*/
