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
		//System.out.print(array[0]);
	//for(int k = 0; k < i; k++)	
		//System.out.println(array[k] + " ");
	
	int[] count = count(array, i);
	//int min = count[0];
	
	for(int k = 0; k < i; k++){	
			if (count[k] == 1)
				System.out.println(array[k] + " " + " occurs " + count[k] + " time"  );
			
			else if (count[k] > 1)
				System.out.println(array[k] + " " + " occurs " + count[k] + " times"  );
		
	}
		
	input.close();
	}
		
		public static int[] count(int[] array, int number){
			
			int[] count = new int[number];
			
			for (int i = 0; i < count.length; i++){
				//count[array[i]]++;
				
				
				
				for (int j = 0; j < count.length; j++){
					if (array[i] == array[j])
						count[i]++;
				}
			
			}
			//for(int u: count)
				//System.out.print(u + " ");
			
			return count;
				
		}

		/*public static void print(int[] array, int number){
			int[] newArray = new int[number];
			
			for(int i = 0; i < newArray.length; i++){
				for (int j = 0; j < newArray.length; j++){
				if (array2[k] == 1 && array)
		System.out.println(array[k] + " " + " occurs " + array2[k] + " time"  );
		else
			System.out.println(array[k] + " " + " occurs " + array2[k] + " times"  );
				
			}
		}
		}*/
}
