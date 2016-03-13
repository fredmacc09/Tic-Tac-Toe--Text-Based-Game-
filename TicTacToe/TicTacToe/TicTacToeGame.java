/**
 * This class is the logic behind the Tic Tac Toe game. It is a purely text based game.
 * @author Frederick Wilson
 * @published Mar 18, 2014
 * @revised Nov 16, 2014
 * Note: This class project only required us to utilize a 2D array. The Tic Tac Toe idea was my creativity.
 */

package TicTacToe;

import java.util.Scanner;

public class TicTacToeGame {
	
	public void run(){ 
		
		Scanner keyboard = new Scanner(System.in);
		GameBoard gb = new GameBoard();// creates a game board object
		Player decision = new Player();// creates the player object
		Computer cpuPick = new Computer(); //creates an AI
		System.out.println("Choose Your Position 1-9 on board (ergo, 5 is the middle of Board) [0_0]");
		gb.printBoard();//method call to print an empty game board for reference
		
		int i = 0;  //variable to run loop
		while (i == 0)  //loop to play through game
		{	
			decision.setPick(keyboard.nextInt());//user choice position
			if((decision.getPick() < 0) || (decision.getPick() > 9) ){ //checks to see if position is on board
				System.out.println("User, You must pick a position on the board! Try again!! [0_0]");
				gb.update('O', cpuPick.getPickCpu());//Computer picks a position on board since User messed up
			//	gb.updateBoard();//prints the updated game board
				gb.gameWonCheck(); //checks to see if game has been completed
				if(gb.gameWonCheck() == "Game Win User"){
					System.out.println("You win User, You prove more of a challenge than Sark [0_0]");
					i = 1;
				}
				else if (gb.gameWonCheck() == "Game Win AI"){
					 System.out.println("You thought you could defeat the Master Control Program?!?!?! [0_0]");
					i = 1;
				}
				else{
					
					i = 0;
					//System.out.println(""); //empty line return
					System.out.println("\nYour turn [0_0]");
					gb.updateBoard(); //prints the updated game board
					System.out.println(" "); //empty line return
				}
				
			}
			else
			{			
				gb.update('X', decision.getPick());//update method to place 'X' on board
				gb.updateBoard(); //prints updated game board
				System.out.println("");
				gb.gameWonCheck();//checks to see if requirements met to win the game for the user and computer
				if(gb.gameWonCheck() == "Game Win User"){
					System.out.println("You win User, You prove more of a challenge than Sark [0_0]");
					i = 1;
				}
				else if (gb.gameWonCheck() == "Game Win AI"){
					 System.out.println("You thought you could defeat the Master Control Program?!?!?! [0_0]");
					i = 1;
				}
				else{
					
					i = 0;
					System.out.println(""); //empty line return
					System.out.println("\nYour turn [0_0]");
					gb.updateBoard(); //prints the updated game board
					System.out.println(" "); //empty line return
				}
				System.out.println(""); //empty line return
			//	System.out.println("\nYour turn [0_0]");
			//	gb.updateBoard(); //prints the updated game board
				System.out.println(" "); //empty line return
				cpuPick = new Computer();//creates the computer object every iteration to get a new random position
					if (cpuPick.getPickCpu() == decision.getPick()) //checks if random choice is same as user
					{	cpuPick.setPickCpu(decision.getPick() + 1);//moves random choice one space ahead if same as user 
						gb.update('O', cpuPick.getPickCpu());//updates the game board with the move
						gb.updateBoard();//prints the updated game board
						System.out.println(""); //empty line return
						gb.gameWonCheck();//checks to see if requirements met to win the game for the user and computer
						if(gb.gameWonCheck() == "Game Win User"){
							System.out.println("You win User, You prove more of a challenge than Sark [0_0]");
							i = 1;
						}
						else if (gb.gameWonCheck() == "Game Win AI"){
							 System.out.println("You thought you could defeat the Master Control Program?!?!?! [0_0]");
							i = 1;
						}
						else{
							
							i = 0;
							System.out.println(""); //empty line return
							System.out.println("\nYour turn [0_0]");
							gb.updateBoard(); //prints the updated game board
							System.out.println(" "); //empty line return
						}
					} 
					else
					{
						gb.update('O', cpuPick.getPickCpu());//update method to place 'O' on board
						gb.updateBoard();//prints the updated game board
						gb.gameWonCheck();//checks to see if requirements met to win the game for the user and computer
						if(gb.gameWonCheck() == "Game Win User"){
							System.out.println("You win User, You prove more of a challenge than Sark [0_0]");
							i = 1;
						}
						else if (gb.gameWonCheck() == "Game Win AI"){
							 System.out.println("You thought you could defeat the Master Control Program?!?!?! [0_0]");
							i = 1;
						}
						else{
							
							i = 0;
							System.out.println(""); //empty line return
							System.out.println("\nYour turn [0_0]");
							gb.updateBoard(); //prints the updated game board
							System.out.println(" "); //empty line return
						}
					}			
			}
		}
		keyboard.close();
	}	
}
