/**
 * This class will demonstrate how to create a 2D array
 * @author Frederick Wilson
 * @since Mar 18, 2014
 * @revised Nov 16, 2014
 * Note: The program was made to build a Tic Tac Toe board
 */
package TicTacToe;

public class GameBoard {

	char[][] gameBoard = new char[3][3];//creating the 2D array to be used as a game board
	
	/**
	 * This method just prints the 2D array as a board to the console
	 * as a beginning reference
	 */
	public void printBoard() {
		// 1st Row
		gameBoard[0][0] = ' ';System.out.print("|"+ gameBoard[0][0] + " |");
		gameBoard[0][1] = ' ';System.out.print(gameBoard[0][1] + " |");
		gameBoard[0][2] = ' ';System.out.print(gameBoard[0][2] + " |\n");
		// 2nd Row
		gameBoard[1][0] = ' ';System.out.print("|"+ gameBoard[1][0] + " |");
		gameBoard[1][1] = ' ';System.out.print(gameBoard[1][1] + " |");
		gameBoard[1][2] = ' ';System.out.print(gameBoard[1][2] + " |\n");
		// 3rd Row
		gameBoard[2][0] = ' ';System.out.print("|"+ gameBoard[2][0] + " |");
		gameBoard[2][1] = ' ';System.out.print(gameBoard[2][1] + " |");
		gameBoard[2][2] = ' ';System.out.print(gameBoard[2][2] + " |\n");
	}
	
	/**
	 * This method just prints the updated board after 
	 * positions are chosen
	 */
	public void updateBoard(){
		// 1st Row
		System.out.print("| "+ gameBoard[0][0] + " |");
		System.out.print(gameBoard[0][1] + " |");
		System.out.print(gameBoard[0][2] + " |\n");
		// 2nd Row
		System.out.print("| "+ gameBoard[1][0] + " |");
		System.out.print(gameBoard[1][1] + " |");
		System.out.print(gameBoard[1][2] + " |\n");
		// 3rd Row				
		System.out.print("| "+ gameBoard[2][0] + " |");
		System.out.print(gameBoard[2][1] + " |");
		System.out.print(gameBoard[2][2] + " |\n");
	}
	
	/**
	 * This method updates the game board with the player
	 * and the computer position choice
	 * @param newChoice is the 'X' or 'O' 
	 * @param position is the position on the board
	 */
	public void update(char newChoice,int position){
		switch (position){
		case 1 : gameBoard[0][0]= newChoice; break;
		case 2 : gameBoard[0][1]= newChoice; break;
		case 3 : gameBoard[0][2]= newChoice; break;
		case 4 : gameBoard[1][0]= newChoice; break;
		case 5 : gameBoard[1][1]= newChoice; break;
		case 6 : gameBoard[1][2]= newChoice; break;
		case 7 : gameBoard[2][0]= newChoice; break;
		case 8 : gameBoard[2][1]= newChoice; break;
		case 9 : gameBoard[2][2]= newChoice; break;
		}
	}
	/**
	 * This method checks the game board for the player's 
	 * choice and determines if the player has one or not 
	 */
	public void gameWonCheck(){
			if( //check for diagonal win
				(gameBoard[0][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X')||//left-right diagonal
				(gameBoard[0][2] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][0] == 'X')||//right-left diagonal
			    //check for column win
				(gameBoard[0][0] == 'X' && gameBoard[1][0] == 'X' && gameBoard[2][0] == 'X')||//first column
				(gameBoard[0][1] == 'X' && gameBoard[1][1] == 'X' && gameBoard[2][1] == 'X')||//second column
				(gameBoard[0][2] == 'X' && gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X')||//third column
				//check for row win
				(gameBoard[0][0] == 'X' && gameBoard[0][1] == 'X' && gameBoard[0][2] == 'X')||//first row
				(gameBoard[1][0] == 'X' && gameBoard[1][1] == 'X' && gameBoard[1][2] == 'X')||//second row
				(gameBoard[2][0] == 'X' && gameBoard[2][1] == 'X' && gameBoard[2][2] == 'X')) {//third row
				System.out.println("You are the Tic Tac Toe GOD!!!");
				System.exit(0);
			} 
			else if(//checks for AI win
				//check for diagonal win
				(gameBoard[0][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O')||//left-right diagonal
				(gameBoard[0][2] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][0] == 'O')||//right-left diagonal
			    //check for column win
				(gameBoard[0][0] == 'O' && gameBoard[1][0] == 'O' && gameBoard[2][0] == 'O')||//first column
				(gameBoard[0][1] == 'O' && gameBoard[1][1] == 'O' && gameBoard[2][1] == 'O')||//second column
				(gameBoard[0][2] == 'O' && gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O')||//third column
				//check for row win
				(gameBoard[0][0] == 'O' && gameBoard[0][1] == 'O' && gameBoard[0][2] == 'O')||//first row
				(gameBoard[1][0] == 'O' && gameBoard[1][1] == 'O' && gameBoard[1][2] == 'O')||//second row
				(gameBoard[2][0] == 'O' && gameBoard[2][1] == 'O' && gameBoard[2][2] == 'O')) {//third row
			  System.out.println("For shame, For shame");
			  System.exit(0);
			}
		}
}
