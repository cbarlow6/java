package practice;

public class GradingTest {
	public static void main (String [] args){
		
	char[] key = { 'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};
	
	char[][] answers ={
			{'A', 'B','A', 'C','C', 'D', 'E','E','A','C'},
			{'D', 'B','A', 'B','C', 'D', 'E','E','A','D'}
			
	};
		for(int i = 0; i< answers.length; i++){
			
			int correct = 0;
			
		for( int j = 0; j<answers[i].length; j++){
			
			if (answers[i][j] == key[j]){
			correct++;
		}
		}
		System.out.println("Student " + i + " has a correct count of " + correct);
		
		
		}
		
		
	}
}
