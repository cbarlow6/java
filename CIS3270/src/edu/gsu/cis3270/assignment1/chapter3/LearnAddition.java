package edu.gsu.cis3270.assignment1.chapter3;
import java.util.Scanner;

public class LearnAddition {

	public static void main(String[] args){
		
		int number1 = (int)(Math.random() * 100);
		
		int number2 = (int)(Math.random() * 100);
		
		int sum = number1 + number2;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter sum of " + number1 + " and " + number2);
		
		int answer = input.nextInt();
			
		System.out.println(sum == answer);
			
		
		input.close();
		
	}
}
