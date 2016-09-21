package edu.gsu.cis3270.test;

public class PrimeNumber {

	public static void main(String [] args){
	
	int number = 7;
	
	System.out.print(isPrime(number));
	
	}


		public static boolean isPrime(int number){
		
			for(int i = 2; i < number; i++){
				
			if(number % i == 0)
			
				return false;	
				
			
			}
	
			return true;
		}
}