package edu.gsu.cis3270.assignment2.chapter9;
import java.util.Scanner;

public class DigitOccurrence {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a string:");
		
		String str = input.nextLine();
		
		int[] newArray = count(str);
		
		for(int i = 0; i < newArray.length; i++){
			System.out.println("Digit " + i + " occurs " + newArray[i]);
			
		}
		input.close();
	}

		public static int[] count(String s){
			int[] counts = new int[10];
					
			//System.out.println(s.length());
			
			//for(int j = 0; j < counts.length; j++){
				for(int i = 0; i < s.length(); i++){
					//System.out.println(s.charAt(i) + " " +  i);
					
					String str = String.valueOf(s.charAt(i));
					//if(Integer.parseInt(str) ==  j){
					 counts[Integer.parseInt(str)]++;
				 }
			//}
			
			//}
			
			//for(int i = 0; i < counts.length; i++){
				//System.out.println(counts[i]);
				//}
				
				
			
			return counts;
		}
}
