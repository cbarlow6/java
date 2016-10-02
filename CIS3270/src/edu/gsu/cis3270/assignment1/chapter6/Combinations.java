package edu.gsu.cis3270.assignment1.chapter6;
import java.util.Scanner;

public class Combinations {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		int[] array = new int[10];
		
		System.out.println("Enter 10 integers" );
		
		for(int i = 0; i < array.length; i++)
			array[i] = input.nextInt();
			
			//for(int u: array)
			//System.out.print(array);
			
			for(int i = 0; i < array.length; i++){
				for(int j = 0; j < array.length; j++){
					if(array[i] != array[j]){
					System.out.print(array[i]);
					System.out.println(array[j]);
					}
				}
	
			}	
		input.close();	
	}
}
