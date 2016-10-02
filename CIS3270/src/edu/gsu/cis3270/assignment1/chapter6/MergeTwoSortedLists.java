package edu.gsu.cis3270.assignment1.chapter6;
import java.util.Scanner;

public class MergeTwoSortedLists {
	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter number of elements in list1 and list2");
		int number1 = input.nextInt();
		int number2 = input.nextInt();
		int sum = number1 + number2;
		
		int [] list1 = new int [number1];
		int [] list2 = new int [number2];
		int [] list3 = new int [sum];
		
		System.out.println("Enter list1");
		
		for(int i = 0; i < list1.length; i++ )
			list1[i] = input.nextInt();
			
			
			
		System.out.println("Enter list2");
		
		for(int i = 0; i < list2.length; i++)
			list2[i] = input.nextInt();
		
			
	
			//populate list 3
		for(int i = 0; i < list1.length; i++)
			list3[i] = list1[i];	
			
		for(int i = 0,  j = list1.length; i < list2.length; i++, j++)	
			list3[j] = list2[i];
		
		//sorted(list1);
		//sorted(list2);
		sorted(list3);
		
		//for(int u : list1)
		//System.out.print(u + " ");
		
		//for(int v : list2)
			//System.out.print(v + " ");
		
		for(int z : list3)
			System.out.print(z + " ");
	input.close();
	}

		public static int[] sorted(int[] list){
			for(int i = 0; i < list.length; i++){
				
				for(int j = 0 ; j < list.length - 1 -i; j++){
					if (list[j] > list[j + 1]){
						//int temp;
						int temp = list[j];
						list[j] = list[j+1];
						list[j+1] = temp;
					}	
				}	
						
			}
			return list;
		}
}
