package edu.gsu.cis3270.assignment1.chapter7;
import java.util.Scanner;
public class TicTacToe {

	public static void main(String [] args){
		
		Scanner input = new Scanner(System.in);
		int count = 0;
		char[][] grid = new char[3][3];
		
		while (count < 9){
		
			//Enter Player X's moves
			System.out.println("Enter a row (0, 1, or 2); for player X: ");
			int rowInput = input.nextInt();
			
			System.out.println("Enter a column (0, 1, or 2) for player X:");
			int colInput = input.nextInt();
			
			//Enter player X's move
			grid[rowInput][colInput] = 'X';
			
			//Display board
			board(grid);
			count++;
			isWinner(grid);
		
			//check for winner
			if(isWinner(grid)){
				System.out.print("Player X wins");
				System.exit(0);
			}
		
			if(count < 9){
				//Enter Player O's move
				System.out.println("Enter a row (0, 1, or 2); for player O: ");
				rowInput = input.nextInt();
				
				System.out.println("Enter a column (0, 1, or 2) for player O:");
				colInput = input.nextInt();
				
				//Enter player O's move
				grid[rowInput][colInput] = 'O';
				
				//Display board
				board(grid);
				count++;
				
				isWinner(grid);
				
			//check for winner
				if(isWinner(grid)){
					System.out.println("Player O wins");
					System.exit(0);
				}
			
			}
		}
		System.out.println("Draw. Game Over");
		input.close();
	}
	

		//Print tic-tac-toe board
		public static void board(char[][] grid){
			System.out.println("---------------------------");
			for(int row = 0; row < grid.length; row++){
				System.out.print("|  ");
				for(int column = 0; column < grid[row].length; column++ ){
					
					System.out.print(grid[row][column] + "\t" + "|  ");
					//System.out.print("|\t");
				}	
				System.out.println();
				System.out.println("---------------------------");
			}
			//isWinner(grid);
		}


		public static boolean isWinner(char[][] grid){
			
			//check row for winner
			for(int row = 0; row < 3; row++){
				if(grid[row][0] == grid[row][1] 
					&& grid[row][0] == grid[row][2] 
						&& grid[row][0] == 'X' ^ grid[row][0] == 'O')		
					return true;
			}
			//check column for winner
			for(int col = 0; col < 3; col++){
				if(grid[0][col] == grid[1][col]
					&& grid[0][col] == grid[2][col] 
							&& grid[0][col] == 'X' ^ grid[0][col] == 'O')
					return true;		
			}
		
			//check major diagonal
			if(grid[0][0] == grid[1][1]
				&& grid[0][0] == grid[2][2] 
						&& grid[0][0] == 'X' ^ grid[0][0] == 'O')
				return true;
			
			//check minor diagonal
			if(grid[0][2] == grid[1][1]
				&& grid[0][2] == grid[2][0] 
						&& grid[0][2] == 'X' ^ grid[0][2] == 'O')
				return true;
			
			
		return false;
		}
}		
