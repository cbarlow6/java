package edu.gsu.cis3270.assignment1.chapter5;

public class Emirp {
	 public static void main(String [] args){
	        
	        
	        // set starting point for test
	        int number = 13;
	        int number2 = 0;
	        int count = 0;
	        int numbersPerLine = 10;
	        
	        while(count < 100){        
	        // test number for primeness
	        isPrime(number);
	        
	        // reverse number if prime
	        if (isPrime(number) == true)
	            
	            number2 = reverse(number);
	        
	        
	        // test reverse number for primeness
	        isPrime(number2);
	        
	        if(isPrime(number2) == true && isPrime(number) == true){
	        	count++;
	        	if (count % numbersPerLine == 0)
	            	System.out.println(number + " ");
	            	else
	            		System.out.print(number + " ");
	            
	        }
	        	number++;
	        	
	       } 
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
	            
	            value = value * 10 + remainder;
	            
	            
	        }
	        //System.out.println(value);
	        return value;
	    }
	    
	    
	    

}
