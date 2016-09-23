package edu.gsu.cis3270.assignment1.chapter4;
import java.util.Scanner;

public class DecimalToHex {

	public static void main(String [] args){
			
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter decimal number");
	
	int number = input.nextInt();
	int h = 0;
	
	while (number / 16 > 0){
		//int i=0;
		  h = number % 16;	
		
		switch (h){
		case 10: System.out.print('A'); break;
		case 11: System.out.print('B'); break;
		case 12: System.out.print('C'); break;
		case 13: System.out.print('D');break;
		case 14: System.out.print('E'); break;
		case 15: System.out.print('F'); break;
		default: System.out.print(h);	
		
		}
		
		number = number / 16;
	
		
		
	}
	System.out.print(number % 16);
	
			
			
		}
}
