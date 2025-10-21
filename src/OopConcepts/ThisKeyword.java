/* 👉 The this keyword refers to the current object of the class.

        Whenever you are inside a class method or constructor,
        this means → “the current object that is calling this method.”
        this() method calls the constructor of the same class.
 🧩 Why do we need this?

 We mostly use this when local variables (like method parameters) have the same name as instance variables
 */

/* class A {
    void display(B b) {
        System.out.println("Display from class A");
    }

    void show() {
        B obj = new B();
        obj.print(this);   // passing current A object
    }
}

class B {
    void print(A a) {
        System.out.println("Print from class B");
    }
}

public class Thiskeyword {
    public static void main(String[] args) {
        A a = new A();
        a.show();
    }
} */

//2nd Example

class Thiskeyword {
    int x = 5;

    void print() {
        int x = 10;
        System.out.println(x);
        System.out.println(this.x);
    }

    public static void main(String[] args) {
        Thiskeyword d = new Thiskeyword();
        d.print();
    }
}

/* Use of this	                            What It Does	                        Example
this.variable	                        Refers to instance variable	            this.name = name;
this()	                            Calls another constructor in same class	        this("Ali", 20);
this.method()	                Calls another method in same class	            this.show();
return this;	            Enables method chaining	                        add().multiply().show();
pass this	                Pass current object to another method	            p.print(this);

 */
