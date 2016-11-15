package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;
import java.util.Arrays;

public class SortCharacters {
	public static void main(String[] args){
	
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:" );
		
		String str = input.nextLine();
		
		System.out.println(sort(str));
		
		
		input.close();
	}

		public static String sort(String s){
			
			char[] chars = s.toCharArray();
			
			 Arrays.sort(chars);
			
			//for(int i = 0; i < chars.length - 1; i++){
				
				//if(chars[i] > chars[i + 1]){
				//	char temp = chars[i];
				//	chars[i] = chars[i + 1];
				//	chars[i + 1] = temp;
				//}
			//}
			
			String str = new String(chars);
			
			return str;
}




}
