package edu.gsu.cis3270.assignment1.chapter7;
import java.util.Scanner;

public class HeadAndTails {

	public static void main(String []args){
		Scanner input = new Scanner(System.in);
		
		char [][] matrix = new char[3][3];
		System.out.println("Enter a number between 0 and 511: ");
		
		int number = input.nextInt();
		
		String newNumber = String.format("%9s", Integer.toBinaryString(number)).replace(" ", "0");
		
		//System.out.print(newNumber);
		
		int sum = 0;
		for(int row = 0; row < 3; row++){
			for(int col = 0; col < 3; col++){
				matrix[row][col] = newNumber.charAt(sum);
				sum = sum + 1;
			}
		
		}
		for(int row = 0; row < matrix.length; row++){
			for(int col = 0; col < matrix[row].length; col++)
			if((matrix[row][col]) == '0')	
				System.out.print("H" + " ");
			
				else
				System.out.print("T" + " ");
			
			System.out.println();
		}
			input.close();
	}

	
}
