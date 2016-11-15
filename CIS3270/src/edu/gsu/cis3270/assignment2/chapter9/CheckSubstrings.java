package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class CheckSubstrings {

	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter string1:");
	
	String str1 = input.nextLine();
	
	System.out.println("Enter string2:" );
	
	String str2 = input.nextLine();
	
	if(sub(str1, str2)){
		System.out.println(str1 + " is a substring of " + str2);
	}
	else 
		System.out.println(str1 + " is not a substring of " + str2);
	

	input.close();
	}

		public static boolean sub(String str1, String str2){
			boolean result = false;
			int count = 0;
			
			
		for(int i = 0, j = 0; i < str2.length() && j < str1.length(); i++){
			if(str1.charAt(j) == str2.charAt(i)){
				count++;
				j++;
			}
			if(count == str1.length()){
				result = true;
			}
			
		
		
		}
		return result;	
	}

		
}
