package edu.gsu.cis3270.assignment1.chapter4;
import java.util.Scanner;


public class DisplayPyramid {

	public static void main(String[] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter the number of lines: ");
		
		int number = input.nextInt();
		
		
		for(int i = 1; i <= number; i++){
			for (int j = number; j >= 1; j--){
		        System.out.print(j <= i ? j + " ": " " + " ");
		        /*if  (j <= i){
		        	System.out.print(j + " ");
		        }
		        else {
		        	System.out.print(" " + " ");
		        }*/
				
			}
			for (int k = 2; k <=  i; k++ ){
				System.out.print(k + " ");
			}
			System.out.println();
		}
	input.close();
	}
	
}
