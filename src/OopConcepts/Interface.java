/* multiple inheritence can be achieved through Interface.
Interface is a contract that classes must follow.
 Methods are abstract by default, Methods are always public */


 /* interface Animal {
    void makeSound();  // abstract by default
    void eat();        // abstract by default
}

class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog barks");
    }

    public void eat() {
        System.out.println("Dog eats meat");
    }
    public void DogMethod(){                       // can't access its own method until its own object is created.
        System.out.println("Dog's own method only called when Dog object is created");
    }
}

public class Interface {
    public static void main(String[] args) {
        Animal dog = new Dog();
        dog.makeSound(); // Dog barks
        dog.eat();       // Dog eats meat


        Dog d = new Dog();
        d.DogMethod();
        
    }
}
 */

/* consider the example of Vehicles like bicycles, cars and bikes share common functionalities, 
which can be defined in an interface, allowing each class (e.g., Bicycle, Car, Bike) to 
implement them in its own way. 
This approach ensures code reusability, scalability and consistency across different vehicle types. 

Add interface keyword for the interface class, add implements keyword fro subclasses*/

interface Vehicle {
    
    // Abstract methods defined
    void changeGear(int a);
    void speedUp(int a);
    void applyBrakes(int a);
}

// Class implementing vehicle interface
class Bicycle implements Vehicle{
    
    int speed;
    int gear;
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
}

// Class implementing vehicle interface
class Bike implements Vehicle {
    
    int speed;
    int gear;
    
    // Change gear
    @Override
    public void changeGear(int newGear){
        gear = newGear;
    }
    
    // Increase speed
    @Override
    public void speedUp(int increment){
        speed = speed + increment;
    }
    
    // Decrease speed
    @Override
    public void applyBrakes(int decrement){
        speed = speed - decrement;
    }
    
    public void printStates() {
        System.out.println("speed: " + speed
            + " gear: " + gear);
    }
    
}

class Interface
{    
    public static void main (String[] args) 
    {
    
        // Instance of Bicycle(Object)
        Bicycle bicycle = new Bicycle();
        
      	bicycle.changeGear(2);
        bicycle.speedUp(3);
        bicycle.applyBrakes(1);
        
        System.out.print("Bicycle present state : ");
        bicycle.printStates();
        
        // Instance of Bike (Object)
        Bike bike = new Bike();
        bike.changeGear(1);
        bike.speedUp(4);
        bike.applyBrakes(3);
        
        System.out.print("Bike present state : ");
        bike.printStates();
    }
}
