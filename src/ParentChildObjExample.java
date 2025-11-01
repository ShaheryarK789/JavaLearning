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
            //Reference type decides what you can access. Object type decides what actually runs for overridden.
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
// out of class instance block and static block creation

class Parent {
    static {
        System.out.println("A ");
    }

    {
        System.out.println("B ");
    }
}

public class Child extends Parent {
    static {
        System.out.println("C ");
    }

    {
        System.out.println("D ");
    }

    public static void main(String[] args) {
        Child child1 = new Child(); 
        Child child2 = new Child();  
    }
}
ChatGPT said:

Excellent 👏 — you’ve now added two object creations, which makes the execution order even clearer.

Let’s walk through exactly what happens step-by-step 👇

💻 Code Recap
class Parent {
    static {
        System.out.println("A ");
    }

    {
        System.out.println("B ");
    }
}

public class Child extends Parent {
    static {
        System.out.println("C ");
    }

    {
        System.out.println("D ");
    }

    public static void main(String[] args) {
        Child child1 = new Child();
        Child child2 = new Child();
    }
}

🧠 Step-by-Step Execution
1️⃣ Class Loading Phase

When Child.main() runs:

JVM loads the Child class.

Before Child can load, its superclass Parent must also load.

👉 So:

Parent’s static block runs → prints A

Child’s static block runs → prints C

✅ Output so far:

A 
C 

2️⃣ Object Creation Phase

Now the code executes:

Child child1 = new Child();


To create the first object:

Parent’s instance block runs → prints B

Child’s instance block runs → prints D

✅ Output so far:

A 
C 
B 
D 


Then the next line executes:

Child child2 = new Child();


When creating the second object, remember:

Static blocks do not run again — they run only once per class (when the class is first loaded).

So only the instance blocks run again:

Parent’s instance block → prints B

Child’s instance block → prints D

✅ Final Output:

A 
C 
B 
D 
B 
D
