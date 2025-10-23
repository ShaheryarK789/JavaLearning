package Arrays;

//An ArrayList is a dynamic array — it can grow and shrink automatically.
//It belongs to java.util package and stores objects only (not primitive types directly).
//✅ Can hold objects only — e.g., ArrayList<Integer> for numbers
//✅ Provides many built-in methods:
//add(), remove(), get(), set(), size(), contains(), etc.
//✅ Maintains insertion order (like an array)

/* Feature	                            ArrayList	                            LinkedList
Data Structure	            Dynamic array	                            Doubly linked list
Storage	                Stores elements in a contiguous array	    Each element (node) stores data + address of next and previous nodes
Access                          Fast	                                    Slow (O(n)) — must traverse nodes
Insertion/Deletion	            Slow (O(n))                                  just change pointers (if node reference known)
Memory usage	            Less memory	                            More memory (extra references per node)
Iteration           speed	Faster (better cache locality)	                    Slower
Best use case	            Frequent access                 	    Frequent insertions/deletions, sequential access
 */

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


		                System.out.println("\n==============>  For with Remove Example....");
        for (int h=0; h<z.size();h++)
        {        	
            if ("man".equals(z.get(h)))
                { // z.remove(h);
                    z.set(h, "Woman");
                 }
      System.out.println(z.get(h));
        } 
        
}
	
}	
