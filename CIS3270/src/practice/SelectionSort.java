package practice;

public class SelectionSort {

	public static void main(String [] args){
		
		int[] array = {2, 10,4,20,3};
		
		int min;
		int minIndex;
		
		for( int j = 0; j< array.length; j++){
			min = array[j];
			minIndex = j;
		
		
		for (int i = 1 + j; i < array.length; i++) {
			
			 
			if (min > array[i]){
				
				min = array[i];
				minIndex = i;
				
				
				
			}	
			
		}
		int temp = array[minIndex];
		array[minIndex] = array[j];
		array[j] = temp;
		}	
		for (int i : array){
			System.out.print(i + " ");
		}
		
		
	
}
}
