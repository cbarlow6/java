package edu.gsu.cis3270.assignment1.chapter6;
import java.util.Scanner;

public class Sorted {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements in list");
		int number = input.nextInt();
		
		int[] list = new int[number];
		System.out.println("Enter list");
		
		//populate array
		for(int i = 0; i < number; i++){
			list[i] = input.nextInt();
			
		}
		System.out.print(number + " ");
		for(int u: list)
		System.out.print(u + " ");
		
		System.out.println();
		
		if(isSorted(list) == true)
			System.out.print("The list is already sorted");
		else
			System.out.print("The list is not sorted");
		
		input.close();
	}

	public static boolean isSorted(int [] list){
		boolean result = true;
		
		for(int i = 0; i < list.length; i++){
			for(int j = i + 1; j < list.length; j++){
			if(list[i] > list[j])
				result = false;
			}
		}
		
		return result;
		
		
		
		
	}
}
