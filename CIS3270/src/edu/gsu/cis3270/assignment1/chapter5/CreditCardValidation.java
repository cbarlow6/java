package edu.gsu.cis3270.assignment1.chapter5;
import java.util.Scanner;

public class CreditCardValidation {
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	long number = input.nextLong();
	
	isValid(number);
	
	
	input.close();
	}

		public static boolean isValid(long number){
			sumOfDoubleEvenPlace(number);
			sumOfOddPlace(number);
			//prefixMatched(number,d);
			return true;
		}
	
		public static int sumOfDoubleEvenPlace(long number){
			int value = 0;
			int sum = 0;
			int prefix = 0;
			while (number > 0){
			 int digit = (int)(number % 100);
			 digit = digit/ 10;
			 prefix = digit;
			 //System.out.println("Digit is " + digit);
			 sum = sum + (getDigit(digit));
			
			 number /= 100;	
			}
			System.out.println("Sum is: " + sum);
			System.out.println("Prefix is: " + prefix);
			return value;
		}

		public static int getDigit(int digit){
			int value = (digit * 2); 
			
			if (value > 9){
				value = (int)(value / 10) + (int)(value % 10);
			}	
			//System.out.println("Value is " + value);
			
			return value;
		}

		public static int sumOfOddPlace(long number){
			int sum = 0;
			int oddDigit = 0;
			while (number > 0){
			 oddDigit = (int)(number % 10);
			 //oddDigit = oddDigit/ 10;
			 
			 System.out.println("Digit is " + oddDigit);
			 sum = sum + oddDigit;
			
			 number /= 100;	
			}
			System.out.println("Sum of odd digit: " + sum);
			return oddDigit;
		}

		//public static boolean prefixMatched(long number, int d){
			
		//}

		/*public static int getSize(long d){
			
		}
		public static long getPrefix(long number, int k){
			
		}*/
		
}
