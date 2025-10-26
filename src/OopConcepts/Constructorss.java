
// parametreized constructor

 class Constructorss {
            int year;
  static    int Countofcars;    // to increase count when new object is created
    Constructorss ()            // Default constructor    
 {       
      
   }   
   Constructorss (int y)        // Param constructor       
 {       year=y;
        Countofcars++;
      
   }
    
void display (){

    System.out.println("Tesla car has this model: "+ year);
}

public void main (){

Constructorss con1 = new Constructorss(2025);
con1.display();
Constructorss con2 = new Constructorss(2026);
con2.display();
System.out.println("Total cars created are: "+ Countofcars);

 }
}
