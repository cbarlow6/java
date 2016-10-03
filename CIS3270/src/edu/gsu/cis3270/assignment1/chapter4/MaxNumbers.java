package edu.gsu.cis3270.assignment1.chapter4;
import java.util.Scanner;

public class MaxNumbers {
	public static void main(String [] args){
	
		int count = 1;
		//int number = 0;
		//int numberOfInputs = 0;
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter numbers: ");
	//read initial number
	int max = input.nextInt();
	int number = input.nextInt();
	
	while (number != 0){
	//compare next input to max
		if (number > max){
			max = number;
		//new max sets count to 1	
			count = 1;
		}	
		// assign next input to number		
		number = input.nextInt();
		
		//increase count if number occurs again
		if(number == max)
			count++;
	}
	System.out.println("Largest number: " + max);
	System.out.print("Occurrence of largest number:" + count);
		
		
	input.close();	
		
	}

}
