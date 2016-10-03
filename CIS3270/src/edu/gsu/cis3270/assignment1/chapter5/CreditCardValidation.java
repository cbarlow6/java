package edu.gsu.cis3270.assignment1.chapter5;
import java.util.Scanner;

public class CreditCardValidation {
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter credit card number as a long integer");
	long number = input.nextLong();
	
	if(isValid(number) == true)
		System.out.print(number + " is valid");
	else
		System.out.print(number + " is invalid");
	
	input.close();
	}

		public static boolean isValid(long number){
			boolean luhn = false;
			boolean prefix = false;
			boolean size = false;
			boolean result = false;
			
			//Luhn check
			int finalSum = sumOfDoubleEvenPlace(number) + sumOfOddPlace(number);
			//System.out.println(finalSum);
			if (finalSum % 10 == 0)
				luhn = true;
				
			//check prefix
			int k = 1;
			//System.out.println("Prefix match is: " + prefixMatched(number,k));
				prefix = prefixMatched(number,k);
			
				//check size
			int length = getSize(number);
			if(length >= 13 && length <= 16)
				size = true;
			
			if(luhn && prefix && size)
			result = true;
			
			return result;
		}
		//Add even place values
		public static int sumOfDoubleEvenPlace(long number){
			//int value = 0;
			int sum = 0;
			//int prefix = 0;
			while (number > 0){
			 int digit = (int)(number % 100);
			 digit = digit/ 10;
			 //prefix = digit;
			 //System.out.println("Digit is " + digit);
			 sum = sum + (getDigit(digit));
			
			 number /= 100;	
			}
			//System.out.println("Sum is: " + sum);
			//System.out.println("Prefix is: " + prefix);
			return sum;
		}
		//Return this number if it is a single digit, otherwise 
		//return the sum of the two digits.
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
			 
			 //System.out.println("Digit is " + oddDigit);
			 sum = sum + oddDigit;
			
			 number /= 100;	
			}
			//System.out.println("Sum of odd digit: " + sum);
			return sum;
		}
		//Return true if the digit d is a prefix for number
		public static boolean prefixMatched(long number, int d){
			boolean result = false;
			getPrefix(number, d);
			//System.out.print( getPrefix(number,d));
				if (getPrefix(number,d) == 4 
						|| getPrefix(number,d) == 5 
						|| getPrefix(number,d) == 3 
						||getPrefix(number,d) == 6){
				result = true;
				}
			return result;		
		}
		//Return the number of digits in d.
		public static int getSize(long d){
			int count = 0;
			while(d > 0){
				d = d / 10;
				count++;
			}
			//System.out.println("Count is: " + count);
			return count;
		}
		//Return the first k number of digits from number. If the number of 
		//digits in number is less than k, return number.
		public static long getPrefix(long number, int k){
			long digit = 0;
			while(number > k){
				digit = number % 10;
				number = number/10;
			
			}
			//System.out.println("Prefix is: " + digit);
			return digit;
		}
		
}
