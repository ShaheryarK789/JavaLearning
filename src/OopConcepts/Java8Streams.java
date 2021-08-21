package OopConcepts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8Streams {

	public static void main(String[] args) {

/* 		Using Streams APIs we can perform different operations on data collections with optimize code.
	 	it also uses lambda --> arrow operator
							Left side is the parameter which can also be empty and right side specifies the action of the lambda expression.
	
		Three step to perform:	
		 1- create a stream by converting collection to 		.stream
		 2- perform any number of intermediate Operations		.filetr  .map  . sort  . distinct .limit etc
		 3- perform terimal operation 							.foreach  .collect   .reduce
*/
		
		// Create an Aray and use it in streams
		ArrayList<String> AL  = new ArrayList<String> ();
		AL.add("David"); AL.add("Jill"); AL.add("Austin");
		
		System.out.println("*********** Using For Loop **************") ;
		for (int i=0; i<AL.size(); i++)
		{
			System.out.println(AL.get(i));
		}
		
		
		// use any combination of followings to get desired results from Stream
		
		//The forEach method is used to iterate through every element of the stream.
		
		System.out.println("*********** Using Streams : simple print **************") ;
		
		AL.stream().forEach(S-> System.out.println(S));
		
		
		System.out.println("*********** Using Streams : sort and then print **************") ;
		
		AL.stream().sorted().forEach(S-> System.out.println("sort and print: " +S));
		
		
		System.out.println("*********** Using Streams : filter the Result **************") ;  
		
		AL.stream().filter(s-> s.startsWith("A")).forEach(S-> System.out.println("Filter: "+S));
		
		
		System.out.println("*********** Using Streams : limit the Result **************") ;   
		
        AL.stream().limit(1).sorted().forEach(S-> System.out.println("limit: "+S));
        
        
        System.out.println("*********** Using Streams : only certain length of string **************") ;   
		
        AL.stream().filter(s->s.length()<5).forEach(S-> System.out.println("Length limit: "+S));
        
        
        System.out.println("*********** Using Streams : Remove duplicate Values in Array **************") ;  
        
        List <Integer> I = Arrays.asList(4,4,2,2,3,3,1);
               
        I.stream().distinct().sorted().forEach(s->System.out.println("remove duplicate and sort: "+s));
        
		// In Java 8, stream().map() lets you convert an object to something else.
        // u can use map when you need modification after you filter results
       
        
        System.out.println("*********** Using Streams : Apply lower case on certain Length of String in Array **************") ;  
        
        AL.stream().filter(s->s.length()<5).map(s->s.toLowerCase()).forEach(s-> System.out.println("map with lower case: "+s));
		
        
        
        System.out.println("*********** Using Streams : concat 2 or more Streams **************") ;   
        
        List <String> A = Arrays.asList("Rizwan","Ali");
        List <String> B = Arrays.asList("Nabbel","Umer");
        Stream <String> CStream=  Stream.concat (A.stream(),B.stream());
        
        CStream.sorted().forEach(S-> System.out.println("Concated streams: "+ S));
        
 
         
        // Stream Collect : is used to change list into stream , do operation and then convert back to List again
        // u need to then store in list variable and then print it 
        
        
        
        System.out.println("*********** Using Streams : Change List into Streams **************") ; 
        List <String> L = A.stream().sorted().collect(Collectors.toList());
        
        System.out.println(L);
        
        L.stream().forEach(s->System.out.println("Print new collect list: "+s));
        
        
        // return true or false Using match
        
     //  boolean flag =   CStream.anyMatch(s->s.equalsIgnoreCase("umer"));
    // return flag;  it will show true or false
    // also can use this to mark test case pass or fail:  Assert.assertTrue(flag);
        
	}

}
