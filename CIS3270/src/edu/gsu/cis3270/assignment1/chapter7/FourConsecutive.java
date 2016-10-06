package edu.gsu.cis3270.assignment1.chapter7;
import java.util.Scanner;


public class FourConsecutive {
	public static void main(String [] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of rows and column for array: ");
		
		int numberOfRows = input.nextInt();
		int numberOfColumn = input.nextInt();
		
		int[][] array = new int[numberOfRows][numberOfColumn];
		
		System.out.println("Enter the values in the array: ");
		
		for(int row = 0; row < array.length; row++){
			for(int column = 0; column < array[row].length; column++){
				array[row][column] = input.nextInt();
			}
		}
		System.out.println(isConsecutiveFour(array));
		
	input.close();
	}

	public static boolean isConsecutiveFour(int [][] values){
		boolean result = false;
		
		if(getCount(values) > 3)
			result = true;
		
		return result;
	}
		public static int getCount(int [][] values){
			int count = 1;
			for(int row = 0; row < values.length; row++){
				count= 0;
				int i = 1;
				for(int column = 0; column < values[row].length-1; column++){
					//int i = 1;
					while((column + i) < values[row].length){
					if(values[row][column] == values[row][column + i])
						count++;	
						i++;
					}			
				}
		
				if(count == 4){
				//System.out.println(count);	
				break;
				}
				
			}				
			System.out.println(count);	
			return count;
		}
		}

