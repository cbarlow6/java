package edu.gsu.cis3270.assignment1.chapter6;

import java.util.Scanner;

public class BubbleSort {
	public static void main(String [] args){
		
		double [] numbers = new double [10];
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter 10 numbers:");
		
		for(int i = 0; i < numbers.length; i ++){
			numbers[i] = input.nextDouble();
		}
		//Scanner input = new Scanner(System.in);
		//System.out.println("Enter 10 numbers:" );
		
		//double[] numbers = new double [10];
		
		//for(int i = 0 ; i <numbers.length; i++)
			//numbers[0 + i] = input.nextDouble();
		
		sorted(numbers);
		
		input.close();
	}
			public static void sorted(double arr[]){
				
				for(int i = 0; i < arr.length; i++){
					
					for(int j = 0 ; j < arr.length - 1 -i; j++){
						if (arr[j] > arr [j + 1]){
							double temp;
							temp = arr[j];
							arr[j] = arr[j+1];
							arr[j+1] = temp;								
					}
				}						
			}		
				for(double u: arr)
					System.out.print(u + "  ");
			
			}
}
