package edu.gsu.cis3270.assignment1.chapter6;
//import java.util.Scanner;

public class EightQueens {
	public static void main(String [] args){
		
	//Scanner input = new Scanner(System.in);
	
	char[][] board = new char[8][8];
	
	board[0][0] = 'Q';
	int count = 1;
	//Display board
	//printBoard(board);
	//System.out.println();
	
	//Determine where to place Queen
	
	for(int row = 0; row < 8; row++){
		if(count < 9)
		for(int col = (int)(Math.random() * 8); col < 8; col++){
			boolean result = moveQueen(board, row, col);
		System.out.print("  " + result);
		
		System.out.println();
		//while(count < 8){ 
			if(result){
			board[row][col] = 'Q';
			count++;
			//System.out.println(count);
			}
		}
	}
	
	//Display board
		printBoard(board);
		System.out.println();
	}
	
	//Print chess board
	public static void printBoard(char[][] board){
		for(int row = 0; row < 8; row++){
			System.out.print("| ");
			for(int col = 0; col < 8; col++)
				System.out.printf(board[row][col] + "\t" +  " | ");
			
			System.out.println();
				
		}
		
	}
	//Validate move
	public static boolean moveQueen(char[][] board, int row, int col){
		System.out.print(row + " " + col);
		
		// check by rows
		for(int i = 0; i < 8; i++ )
			if(board[i][col] == 'Q')
				return false;
		
			//check by columns
		for(int j = 0; j < 8; j++)
				if(board[row][j] == 'Q')
					return false;
		
		//check major diagonal
		if (col > row || col == row){
			for(int i = 0; i < 8 - (col - row); i++)
				if (board[i][i + (col - row) ] == 'Q')
					return false;
		}
		
		if(row > col){
			for(int k = 0; k < 8 - (row - col); k++)	
				if(board[k + (row -col)][k] == 'Q')
					return false;
		}
		
		
		
		// check minor diagonal
		//for(int i = board.length - 1; i > )
			//if(board[i])
		
		
		/*if(row + col < 8){
			for(int i = 0 ; i < (row + col) + 1; i++)
					if(board[(row + col) - i][i] == 'Q')
						return false;
		}	
			
		if(row + col > 8){
			for(int i = 7; i > (row + col - 1) - 7; i--)
				if(board[(row + col) - i ][i] == 'Q')
					return false;
			
		}*/	
		
			
		//check columns
				//for(int col = 1; col < 8; col++)
					//for( int row = 1; row < 8; row++)	
						//if(board[row][col] == 'Q')
							//return false;
		
		
		return true;
	}
	
	}

