package edu.gsu.cis3270.assignment1.chapter6;
//import java.util.Scanner;

public class EightQueens {
	public static void main(String [] args){
		
	//Scanner input = new Scanner(System.in);
	
	char[][] board = new char[8][8];
	
	board[0][0] = 'Q';
	
	//Display board
	printBoard(board);
	System.out.println();
	
	//Determine where to place Queen
	for(int row = 0; row < 8; row++)
		for(int col = 0; col < 8; col++)
			if(moveQueen(board))
				board[row][col] = 'Q';
	
	//Display board
		printBoard(board);
		System.out.println();
	}

	public static void printBoard(char[][] board){
		for(int row = 0; row < 8; row++){
			System.out.print("| ");
			for(int col = 0; col < 8; col++)
				System.out.printf(board[row][col] + "\t"+ "| ");
			
			System.out.println();
				
		}
		
	}
	public static boolean moveQueen(char[][] board){
		// check rows
		for(int row =0; row < 8; row++ )
			for(int col = 0; col < 8; col++)
				if(board[row][col] != 'Q')
					return true;
		
		
		
		return false;
	}
	
}
