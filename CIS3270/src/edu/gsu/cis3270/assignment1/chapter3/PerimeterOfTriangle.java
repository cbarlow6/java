package edu.gsu.cis3270.assignment1.chapter3;
import java.util.Scanner;

public class PerimeterOfTriangle {

	public static void main(String[] arg){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter three sides of a triangle: ");
		
		int side1 = input.nextInt();
		int side2 = input.nextInt();
		int side3 = input.nextInt();
		
		if(side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
			System.out.println("Perimeter is: " + (side1 + side2 + side3));
					
		}
		else {
			System.out.println("Input is invalid");
		}
		
		
		input.close();
	}
}
