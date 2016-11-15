package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class GuessCapitals {
	public  static void main(String[] args){
	
		String [][] capital = {
				{"Alabama", "Montgomery"},
				{"Alaska", "Juneau"},
				{"Arizona", "Phoenix"}		
		};	
	
	String answer;	
	Scanner input = new Scanner(System.in);
	
	for(int row = 0; row < capital.length; row++ ){
		System.out.println("Enter the capital" + capital[row][0]);
		answer = input.nextLine();
		getCapital(capital, answer);
		
	}
	
	
	
	
	input.close();
	}

		public static String getCapital(String[][] capital, String answer){
			
			answer = capital[]
			
				
			return " ";
	
	
}
}
