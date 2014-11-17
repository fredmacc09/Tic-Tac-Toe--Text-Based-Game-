/**
 * This class was the main class to play the Tic tac Toe game. It is a purely text based game.
 * @author Frederick Wilson
 * @published Mar 18, 2014
 * @revised Nov 16, 2014
 * Note: This class project only required us to utilize a 2D array. The Tic Tac Toe idea was my creativity.
 */

package TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		System.out.println("Do You Want To Play A Game? ");// prompts user to play game
		String choice = keyboard.next();// Yes or No User choice
		if (choice.equals("no")) {
			System.out.println("No cake for you!!");
			System.exit(0);
		}else {
			System.out.println("\nCake will be served at the end");
		}
		GameBoard gb = new GameBoard();// creates a game board object
		System.out.println(" ");
		Player decision = new Player();// creates the player object
		System.out.println("Choose Your Position 1-9 on board (ergo, 5 is the middle of Board)");
		gb.printBoard();//method call to print an empty game board for reference
		
		int i = 0; // accumulator to run loop
		while (i == 0) {//loop to play through game
			decision.setPick(keyboard.nextInt());//user choice position
			gb.update('X', decision.getPick());//update method to place 'X' on board
			
			Computer cpuPick = new Computer();//creates the computer object every iteration to get a new random position
			if (cpuPick.getPickCpu() == decision.getPick()) {//checks if random choice is same as user
				cpuPick.setPickCpu(decision.getPick() + 1);//moves random choice one space ahead if same as user 
				gb.update('O', cpuPick.getPickCpu());//updates the game board with the move
				System.out.println("");
				gb.updateBoard();//prints the updated game board
				System.out.println("");
			} 
				gb.update('O', cpuPick.getPickCpu());//update method to place 'O' on board
				gb.updateBoard();//prints the updated game board
				gb.gameWonCheck();//checks to see if requirements met to win the game for the user and computer
			System.out.println("\nYour turn");
			System.out.println(" ");
		}
		keyboard.close();
	}
}
