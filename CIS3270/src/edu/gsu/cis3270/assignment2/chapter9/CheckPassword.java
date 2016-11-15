package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class CheckPassword {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a password of at least 8 characters: ");
		
		int minDigits = 2;
		int count = 0;
		int countDigits = 0;
		
		String password = input.nextLine();
		
		
		
		// check whether password contains letters and digits	
		for(int i = 0; i < password.length(); i++){
			if (Character.isLetterOrDigit(password.charAt(i))){
				count++;
			}		
		}
		
		
		// check whether password contain 2 or more digits
		for( int i = 0; i < password.length(); i++){
			if(Character.isDigit(password.charAt(i))){
				countDigits++;
			}
			
		}
		// check password length
		if(password.length() < 8){
			System.out.println("Password is invalid. Must contain 8 or more characters.");
			}
		// check whether password contain 2 or more digits
			else if (countDigits < minDigits){
			System.out.println("Password is invalid. Must contain 2 or more digits.");	
			}
		// check whether password contains letters and digits	
			else if (count < password.length()){
			System.out.println("Password is invalid. Must contain only letters and digits.");
			}
			else
				System.out.println("Password is valid");
		
		input.close();
	}
}
