package edu.gsu.cis3270.assignment1.chapter6;
import java.util.Scanner;

public class SortStudents {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter number of students");
		
		int number = input.nextInt();
		
		String [] names = new  String[number];
		int [] score = new int[number];
		
		System.out.println("Enter student names and score");
		//populate array
		for(int i = 0; i < number; i++){
			names[i] = input.next();
			score[i] = input.nextInt();
			}
		
		selectionSort(names,score);
	input.close();
	}
	public static void selectionSort(String[] names, int[] score){	
		for(int j = 0; j < score.length - 1; j++){
			// find max array value
			
			String temp;
			int currentMax = score[j]; 
			int currentMaxIndex = j;
		
			for(int i = j + 1; i < score.length; i++ )	{
				if (score[i] > currentMax){
					currentMax = score[i];
					currentMaxIndex = i;
				}
			}
		if(currentMaxIndex != j){
			score[currentMaxIndex] = score[j];
			score[j] = currentMax;
			
			temp = names[j];
			names[j] = names[currentMaxIndex];
			names[currentMaxIndex] = temp;
			
			
		}	
		
		}
		System.out.println("Sorted students: ");
		for(int i = 0; i < score.length; i++)
		System.out.println(names[i] + " " + score[i]);
		
	}
}

