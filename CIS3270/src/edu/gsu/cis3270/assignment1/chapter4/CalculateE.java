package edu.gsu.cis3270.assignment1.chapter4;

public class CalculateE {

	public static void main(String[] args){
		
		int number = 1000;
		double item = 1;
		double e = 1;
		
		while(number <= 10000){
				
			for(int i = 1; i <= number; i++){
			
				item = item /i;
				e = e + item;
						
			}
			
			System.out.println("n is: " + number + " and " + "e is: " + e );
			number = number + 1000;			
		}
					
		
	}
}
