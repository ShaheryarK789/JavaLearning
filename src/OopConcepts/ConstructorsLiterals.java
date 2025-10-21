/*🧱 What is a Constructor in Java?

A constructor is a special method used to initialize an object when it is created.

It has the same name as the class and no return type (not even void).

⚙️ Types of Constructors
1️⃣ Default Constructor (no parameters)

If you don’t create any constructor, Java automatically provides a default constructor that sets default values.
*/
//✅ Example:
class Car {
    // Default constructor
    Car() {
        System.out.println("Car object created");
    }
}

public class ConstructorLiterals {
    public static void main(String[] args) {
        Car c = new Car(); // calls default constructor
    }
}


//2️⃣ Parameterized Constructor : Used to initialize an object with specific values.
/* 
class Car {
    String brand;
    int year;

    // Parameterized constructor
    Car(String b, int y) {
        brand = b;
        year = y;
    }

    void display() {
        System.out.println(brand + " - " + year);
    }
}

public class ConstructorLiterals {
    public static void main(String[] args) {
        Car c1 = new Car("Toyota", 2022);
        Car c2 = new Car("Honda", 2023);

        c1.display();
        c2.display();
    }
}
*/
//3️⃣ Constructor Overloading: Just like methods, constructors can be overloaded (same name but different parameters).
/* 
class Student {
    String name;
    int age;

    // Default constructor
    Student() {
        name = "Unknown";
        age = 0;
    }

    // Parameterized constructors
    Student(String n, int a) {
        name = n;
        age = a;
    }

    void show() {
        System.out.println(name + " is " + age + " years old");
    }
} */

/* public class ConstructorLiterals {
    public static void main(String[] args) {
        Student s1 = new Student();
        Student s2 = new Student("Ali", 20);

        s1.show();
        s2.show();
    }
} */
/******************************************Literals****************************************************8 */


/* 🧠 What are Literals in Java?

A literal is simply a fixed value that you write directly in your code.

It’s the actual data (like 10, "Hello", or true) that’s assigned to a variable.

Think of it as the real value you give to a variable.

📘 Example:
int age = 25; */

