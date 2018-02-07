package com.anuar.tictactoe.xp;

public class TicTacToe {
	private char player = 'X';
	private char[][] table = new char[3][3];
	private int count = 0;
	public boolean endGame = false;
	public boolean hasWinner = false;
	
	public TicTacToe() {
		for(int i=0;i<3;i++)
			for(int j=0;j<3;j++)
				table[i][j] = ' ';
	}
	
	private char getCurrentPlayer() {
		return player;
	}
	
	public char getNextPlayer() {
		if(player == 'X')
			return 'O';
		else
			return 'X';
	}
	
	private void changeCurrentPlayer() {
		if(player == 'X') {
			player = 'O';
		} else {
			player = 'X';
		}
	}
	
	public void play(int row, int col) throws RuntimeException {
		row--;
		col--;
		if(table[row][col] == ' ' && count <= 9 && endGame == false) {
			table[row][col] = this.getCurrentPlayer();
			count++;
			System.out.println(count + "-step:");
			System.out.println(this.toString());
			if(this.hasWon() == true) {
				System.out.println("Player "+this.getCurrentPlayer()+" has won in "+count+" steps.");
				endGame = true;
				hasWinner = true;
			}
			if(count == 9)
				endGame = true;
			if(endGame == true)
				System.out.println("The game has ended.");
			this.changeCurrentPlayer();
		}
		else {
			throw new RuntimeException();
		}
	}
	
	public boolean hasWon() {
		char currentPlayer = this.getCurrentPlayer();
		boolean hasWon = false;
		// case 1: diagonal
		if(table[0][0]==currentPlayer && table[1][1]==currentPlayer && table[2][2]==currentPlayer) {
			hasWon = true;
		}
		// case 2: antidiagonal
		else if(table[2][0]==currentPlayer && table[1][1]==currentPlayer && table[0][2]==currentPlayer) {
			hasWon = true;
		}
		// case 3: column
		else if(table[0][0]==currentPlayer && table[1][0]==currentPlayer && table[2][0]==currentPlayer
				|| table[0][1]==currentPlayer && table[1][1]==currentPlayer && table[2][1]==currentPlayer
				|| table[0][2]==currentPlayer && table[1][2]==currentPlayer && table[2][2]==currentPlayer) {
			hasWon = true;
		}
		// case 4: row
		else if(table[0][0]==currentPlayer && table[0][1]==currentPlayer && table[0][2]==currentPlayer
				|| table[1][0]==currentPlayer && table[1][1]==currentPlayer && table[1][2]==currentPlayer
				|| table[2][0]==currentPlayer && table[2][1]==currentPlayer && table[2][2]==currentPlayer) {
			hasWon = true;
		}
		return hasWon;
	}
	
	public String toString() {
		String tbl = "";
		for(int i=0;i<3;i++) {
			tbl += "+---+---+---+\n";
			for(int j=0;j<3;j++) {
				tbl += "| "+table[i][j]+" ";
			}
			tbl += "|\n";
		}
		tbl += "+---+---+---+\n";
		return tbl;
	}
}
