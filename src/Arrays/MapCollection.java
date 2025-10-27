/* Maps in Java is a part of the java.util package.
It stores key-value pairs and allows fast access to values using their keys.
*/

// HashMap ---- do not maintain order and last updated value wil be saved for that key.

package Arrays;
import java.util.HashMap;

public class HasMap {

	public static void main(String[] args) {
/*
		1- it stores in key value pair
		2- no ordering index
		3- key cannot be dup otherwise last value updated
*/		
		
		HashMap<String,   String> H  =  new HashMap<String,   String> ();
		
		H.put("Name", "Ahmed");
		H.put("address" , "LHR");
		
		System.out.println(H);
		
		System.out.println(H.get("Name"));   }}

/* ConcurrentSkipListMap  -----   keys are sorted naturally, and it’s thread-safe. */

import java.util.concurrent.ConcurrentSkipListMap;

public class Example {
    public static void main(String[] args) {
        ConcurrentSkipListMap<Integer, String> map = new ConcurrentSkipListMap<>();

        map.put(30, "C");
        map.put(10, "A");
        map.put(20, "B");

        System.out.println(map);   // output: {10=A, 20=B, 30=C}
    }
}

/* TreeMap ----- A TreeMap is a collection that stores key/value pairs in sorted order by key. like alphabetical order etc  */
