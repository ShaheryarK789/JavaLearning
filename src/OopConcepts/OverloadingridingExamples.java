/*
// Q1️⃣ — Overloading with Type Promotion
class Test {
    void show(int a, long b) {
        System.out.println("int-long");
    }
    void show(long a, int b) {
        System.out.println("long-int");
    }
}

public class OverloadingExamples {
    public static void main(String[] args) {
        Test t = new Test();
        t.show(10, 20);  
    }
}


👉 What happens?
a) int-long
b) long-int
c) Ambiguity compile error  - true
d) Runtime error

//Q2️⃣ — Reference Type + Overloading
class A {
    void call(A a) {
        System.out.println("A-A");
    }
}

class B extends A {
    void call(B b) {
        System.out.println("B-B");
    }
}

public class OverloadingExamples {
    public static void main(String[] args) {
        A obj = new B();
        B b = new B();
        obj.call(b);
    }
}

/*
👉 What will be printed?
a) A-A
b) B-B
c) Both
d) Compile error

Q3️⃣ — Overriding + Upcasting Chain
class X {
    void print() { System.out.println("X"); }
}
class Y extends X {
    void print() { System.out.println("Y"); }
}
class Z extends Y {
    void print() { System.out.println("Z"); }
}

public class Main {
    public static void main(String[] args) {
        X obj = new Z();
        obj.print();
    }
}


👉 What’s the output?
a) X
b) Y
c) Z
d) Compile error

// Q4️⃣ — Method Hiding vs Overriding
class Parent {
    static void greet() {
        System.out.println("Hello from Parent");
    }
}

class Child extends Parent {
    static void greet() {
        System.out.println("Hello from Child");
    }
}

public class OverloadingExamples {
    public static void main(String[] args) {
        Parent p = new Child();
        p.greet();
    }
}


👉 Output?
a) Hello from Parent  -- True as Static methods are not part of polymorphism
b) Hello from Child
c) Both
d) Compile error
*/
//Q5️⃣ — Trick with Overloading & Null
class Demo {
    void show(Object o) { System.out.println("Objective"); }
    void show(String s) { System.out.println("String"); }
}

public class OverloadingRidingExamples {
    public static void main(String[] args) {
        Demo d = new Demo();
        d.show( d);
    }
}

/*
👉 What will be printed?
a) Object
b) String
c) Compile error (ambiguous)
d) NullPointerException

*/
