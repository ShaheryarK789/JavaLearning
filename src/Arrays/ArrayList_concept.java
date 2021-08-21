package Arrays;

//import java.util.*;
import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayList_concept {

	public static void main(String[] args) {

		//Simple string array        
        
		ArrayList<String>	z = new ArrayList<String> ();
        z.add ("man");  z.add("is"); z.add("wow");   System.out.println(z.size()); System.out.println(z.get(2));
    
        System.out.println("\n==============>  new for) Example....");
        for(String str:z)  
            System.out.println(str);  
        
 
        System.out.println("\n==============>  For Example....");
        for (int i=0; i<z.size(); i++)
        {
        	System.out.println(z.get(i));
        }
  
        System.out.println("\n==============>  While Example....");
        int i=0;
        while (i<z.size())
        {
        	System.out.println("while game:  " +z.get(i));
        	i++;
        }

        System.out.println("\n==============>  Stream.forEach() Example....");
        z.stream().forEach((D) -> System.out.println(D));       	


        System.out.println("\n==============>  Iterator Example....");
        ListIterator<String> C = z.listIterator();
        while (C.hasNext()) {
            System.out.println(C.next());  }
        
}
	
}	
