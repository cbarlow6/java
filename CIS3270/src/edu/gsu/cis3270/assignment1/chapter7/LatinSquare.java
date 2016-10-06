package edu.gsu.cis3270.assignment1.chapter7;
//import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class LatinSquare {
	public static void main(String [] args){

		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number n:");
		
		int n = input.nextInt();
		
		char[] letters = new char[n];
		
		for(int i = 0; i < n; i++)
			letters[i] = (char)('A' + i);
		
		for( char u: letters)
			System.out.print(u + " ");
		
		
		char [][] array = new char[n][n];
		System.out.println("Enter " + n  + " rows of letters separated by spaces");
		
		//accept input of characters
		for(int row = 0; row < array.length; row++){
			for(int column = 0; column < array[row].length; column++)
				array[row][column] = input.next().charAt(0);
			
		//check whether input is between A and A + n	
			//for( char v: array[row])
				//System.out.print("Array1 " + v + " ");
			
			//int i = 0;	
			//while(i < n){
			for(int i = 0; i < n; i++){
				
				//if(!Arrays.equals(array[row], letters)){
	            if(array[row][i] > (char)('A' + array.length-1)){
					System.out.println("Wrong input: the letters must be from A to " 
									+ ((char)('A' + array.length-1)));
					System.exit(0);
				}
			}
				//i++;
			//}	
		}	
			
		//Print array
		/*for(int row = 0; row < array.length; row++){
				for(int column = 0; column < array[row].length; column++){
					System.out.print(array[row][column] + " ");					
				}
				System.out.println();
		}*/

		//Test whether array is Latin square by row
		char[] newArray = new char[array.length];
		for(int i = 0; i < array.length; i++){	
		newArray = sorted(array[i]);
	
		//for( char y: newArray)
			//System.out.print(y + " ");
		
		
		
		if(!Arrays.equals(sorted(newArray), letters)){
			System.out.println("Not a latin square");
			System.exit(0);
			}
	
		
			
		//for(int i = 0; i < array.length-1; i++){
		//for(int row = 0; row < array.length-1; row++){
			//int i = 0;
			/*for(int col = 0; col + 1 < array.length-1; col ++){
				if(array[row][i] == array[row][col + 1 + i]){
				System.out.println("Not a latin square");
				System.exit(0);
				}*/
				
			}
		//Test whether array is Latin square by column	
		char [] array3 = new char[n];
		for(int col = 0; col < n; col++){
			for(int row = 0; row < array.length; row++){
			array3[row] = array[row][col];
			}
			newArray = sorted(array3);
			
			//for( char y: newArray)
			//System.out.print(y + " ");
			
			
			if(!Arrays.equals(sorted(newArray), letters)){
				System.out.println("Not a latin square");
				System.exit(0);
				}
		
		}	
		
		System.out.println("Array is a Latin square");
		input.close();
	}

	public static char [] sorted(char[] array){
		char [] m = new char [array.length];
		
		for(int i = 0; i < array.length; i++)
			m[i] = array[i]; 
				
				
				Arrays.sort(m);
		
		
		
		return m;
	}
}
