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
		
		System.out.println(H.get("Name"));
		
		
		
		

	}

}
