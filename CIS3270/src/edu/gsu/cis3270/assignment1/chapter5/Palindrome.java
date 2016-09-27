package edu.gsu.cis3270.assignment1.chapter5;
import java.util.Scanner;

public class Palindrome {
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter number: ");
		
	int number = input.nextInt();
	
	System.out.print("Is number a palindrome? " + isPalindome(number));
	input.close();		
	}
		public static boolean isPalindome(int number){
			//int number2 = reverse(number);
			
			if (reverse(number) == number)
					return true;
			else
				return false;
			
			
		}
		
		public static int reverse(int number){
			//int newNumber = 0;
			int value = 0;
			while (number != 0){
				int remainder = number % 10;
				
				//newNumber = newNumber + remainder * 10;
				number /= 10;
				
					
					//value = remainder * 10;
				
				//if (number > 0 )
					value = value * 10 + remainder;
					
				//else
					//value = value + remainder;
						
			
			}
			System.out.println(value);
				return value;
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				/*newNumber = Integer.toString(remainder);
				//number = number / 10;
			}
				System.out.print(newNumber);		
				//value = Integer.parseInt(newNumber);
			
			//System.out.print(newNumber);
			
			//System.out.println(value);
		
			//return number;*/
		}


}
