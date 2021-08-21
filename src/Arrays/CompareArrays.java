package Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CompareArrays {

	public static void main(String[] args) {
		
		ArrayList <String>  A1 = new  ArrayList <String> (Arrays.asList("2", "1", "3","F"));
		ArrayList <String>  A2 = new  ArrayList <String> (Arrays.asList("3", "2", "1"));
		
		// 1 - sort the lists
				Collections.sort(A1);
				Collections.sort(A2);    System.out.println(A1 +"===="+ A2);
		
		// 2- compare
				System.out.println(A1.equals(A2));
		
		// find additional element
				ArrayList <String>  B1 = new  ArrayList <String> (Arrays.asList("2", "1", "3","F"));
				ArrayList <String>  B2 = new  ArrayList <String> (Arrays.asList("3", "2", "1"));
				B1.removeAll(B2);
				System.out.println(B1);
				
		// find common elements
				ArrayList <String>  C1 = new  ArrayList <String> (Arrays.asList("2", "1", "3","F"));
				ArrayList <String>  C2 = new  ArrayList <String> (Arrays.asList("3", "2", "1"));
				C1.retainAll(C2);
				System.out.println(C1);
				
		

	}

}
