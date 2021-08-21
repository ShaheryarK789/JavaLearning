package Arrays;

import java.util.ArrayList;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		//STATIC array  //One Dimensinal Arrays (only SAME data type, size is FIXED --Hence STATIC array])


		int i[]= new int [3];

		i[0]=10; i[1]=15;  i[2]=25;  //an array starts with 0 and ends n-1  //can use string or other cariable for arrays

		System.out.println(i[1]);  //"Array out of bound Exception" if its more than defined limit of array like here if use i[3]

		System.out.println(i.length); //it shows length of Array

		//For loop in Arrays

		for ( int j=0; j<i.length; j++)
		{
			System.out.println("Inside loop: "+i[j]);
		}	


		//If need to overcome Same data type issue -  Need Multiple data types in same variable of array the use Object array like Employee info
		//If need to overcome size of array issue  -  Need Dynamic Array, We use Collection -- ArrayList, HashTable 

		//Object Array Topic:

		//Object is a super class in java

		Object ob[]= new Object[4];
		ob[0] = "Tom";
		ob[1] = 25;		
		ob[2] = "1/1/1990";
		ob[3] = "PAK";

		for ( int k=0; k<i.length; k++)
		{
			System.out.println("Inside loop: "+ob[k]);
		}


		//If need to overcome size of array issue  -  Need Dynamic Array, We use Collection -- ArrayList, HashTable 

		*/
		
// Two Dimensional Array
		
		String x[][]= new String[3][5] ;  // this array has 3 rows and 5 colums
		
		System.out.println("it shows total rows...." +x.length);     //
		System.out.println("it shows total coumns...." +x[0].length);  //
		
		x[0][0]="A";x[0][1]="B";x[0][2]="C";x[0][3]="D";x[0][4]="E";		// 1st row and 5 columns
		x[1][0]="A1";x[1][1]="B1";x[1][2]="C1";x[1][3]="D1";x[1][4]="E1";
		x[2][0]="A2";x[2][1]="B2";x[2][2]="C2";x[2][3]="D2";x[2][4]="E2";
		
		System.out.println("1st row and 1 column value...."+x[0][0]);  // 
		
		//print all values in 2D Array : Need to use 2 for loops for this
		
		
		for (int row=0; row < x.length; row++)
			{
				for ( int col=0; col < x[0].length; col++)
				{
					System.out.println( x[row][col] );
				}
			
			}

		
		
		
		
		
}
	
	
	
}
