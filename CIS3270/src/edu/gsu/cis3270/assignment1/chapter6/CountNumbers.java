package edu.gsu.cis3270.assignment1.chapter6;
import java.util.Scanner;


public class CountNumbers {
	public static void main(String [] args){
		
	Scanner input = new Scanner(System.in);
	
	System.out.print("Enter integers between 1 and 100: ");
	
	int [] array = new int[100];
	int number = input.nextInt();
	int i = 0;
	
	while(number > 0){
		array[i] = number;
		i++;
		number = input.nextInt();
	}
		
	
	
	count(array, i);
	
		
	input.close();
	}
		
		public static void count(int[] array, int number){
			int[] newArray = new int[number];
			int[] count = new int[100];
			
			System.arraycopy(array, 0, newArray, 0 , number);
			
	
			for(int k = 0; k < count.length; k++){	
				for (int i = 0; i < newArray.length; i++){	
					if(newArray[i] == k + 1)
					 count[k]++;
				
				
				
				
				}
			
			}
			
			
			for(int i = 0; i < count.length; i++){
				if(count[i] != 0){
					if(count[i] == 1)
						System.out.println((i + 1) + " occurs " + count[i] + " time");
					else 
						System.out.println((i + 1)  + " " + " occurs " + count[i] + " times");
				}
			
			}	
				
		}			
}
