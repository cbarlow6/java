package edu.gsu.cis3270.assignment1.chapter7;

public class WeeklyHours {
	public static void main(String [] args){
		
	int[] [] hours = {
			{2,4,3,4,5,8,8},
			{7,3,4,3,3,4,4},
			{3,3,4,3,3,2,2},
			{9,3,4,7,3,4,1},
			{3,5,4,3,6,3,8},
			{3,4,4,6,3,4,4},
			{3,7,4,8,3,8,4},
			{6,3,5,9,2,7,9}
	};
		
	int [] totalHours = new int[hours.length];
	int [] employee = {0,1,2,3,4,5,6,7};
	
		for(int row = 0; row < hours.length; row++){	
			
			int sum = 0;
			
			for(int column = 0; column < hours[0].length; column++)
			sum += hours[row][column];
			
			totalHours[row] = sum;
			//System.out.println("Sum for employee " + row + " is " + sum);
		}
		
		//for( int u : totalHours)
			//System.out.print(u + " ");
		
		sorted(totalHours, employee);
		
		//System.out.println();
		
		for(int i = 0; i < hours.length; i++){
			System.out.println("Employee " + employee[i] + " worked " + totalHours[i] + " hours");
			
		}
			
		
	}
		public static int[] sorted(int[] totalHours, int[] employee){
			
			for(int j = 0; j < totalHours.length - 1; j++){
				// find max array value
				
				int temp;
				int currentMax = totalHours[j]; 
				int currentMaxIndex = j;
			
				for(int i = j + 1; i < totalHours.length; i++ )	{
					if (totalHours[i] > currentMax){
						currentMax = totalHours[i];
						currentMaxIndex = i;
						
					}
				}
			if(currentMaxIndex != j){
				totalHours[currentMaxIndex] = totalHours[j];
				totalHours[j] = currentMax;
				
				temp = employee[j];
				employee[j] = employee[currentMaxIndex];
				employee[currentMaxIndex] = temp;
				
					
			}
			
			}
			return totalHours;
		}
}