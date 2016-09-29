package edu.gsu.cis3270.assignment1.chapter5;

public class Emirp {
	public static void main(String [] args){
	
	
	// enter starting point for test
		int number = 13;
		int number2 = 0;
	
		
	// test number for primeness
		isPrime(number);
	
	// reverse number if prime 
		if (true)
			
		number2 = reverse(number);
		
		
	// test reverse number for primeness
		isPrime(number2);
		
		if(true)
			
		System.out.print(number + " " + number2+ " ");	
			
		
	}
		public static boolean isPrime(int number){
		
		for (int divisor = 2; divisor < number; divisor++){
			if( number % divisor == 0)
				return false;
		}	
			
		return true;	
			
			
		}
	
	public static int reverse(int number){
		
		int value = 0;
		while (number != 0){
			int remainder = number % 10;
			
			
			number /= 10;
			
				
				
			
			//if (number > 0 )
				value = value * 10 + remainder;
				
			//else
				//value = value + remainder;
					
		
		}
		System.out.println(value);
			return value;
	}
	
		
		
}





