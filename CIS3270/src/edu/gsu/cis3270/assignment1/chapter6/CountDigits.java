package edu.gsu.cis3270.assignment1.chapter6;

public class CountDigits {
	public static void main(String [] args){
		int [] number = new int[100];
		
		for(int i = 0; i < number.length; i++){
			number[i] = (int)(Math.random() * 10);
		}
			
			countNumbers(number);
		
	}
			public static void countNumbers(int numbers[]){
				int [] counts = new int[10];								
				for(int i = 0; i < numbers.length; i++){
					counts[numbers[i]]++;
				}
				for(int i = 0; i < counts.length; i++)
						System.out.println("Count of " + i + ": " + counts[i]);
				
							
			}
			
				
}
