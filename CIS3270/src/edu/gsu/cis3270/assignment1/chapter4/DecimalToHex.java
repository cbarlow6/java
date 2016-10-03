package edu.gsu.cis3270.assignment1.chapter4;
import java.util.Scanner;

public class DecimalToHex {

	public static void main(String [] args){
			
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter decimal number");
	
	int number = input.nextInt();
	int h = 0;
	String newHex = " ";
	while (number  > 0){
	
		  h = number % 16;	
		
		switch (h){
		case 10: newHex = "A" + newHex; break;
		case 11: newHex = "B" + newHex; break;
		case 12: newHex = "C" + newHex; break;
		case 13: newHex = "D" + newHex;break;
		case 14: newHex = "E" + newHex; break;
		case 15: newHex = "F" + newHex; break;
		default: newHex = h + newHex;	
		
		}
		
		number = number / 16;		
		
	}
	System.out.print(newHex);
	
			
	input.close();			
		}

}
