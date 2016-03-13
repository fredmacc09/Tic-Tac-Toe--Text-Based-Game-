/**
 * This class will allow the player to make a move
 * @author Frederick Wilson
 * @since Mar 18, 2014
 * Note: The program was made to be the choice of the human player 
 */
package TicTacToe;

public class Player {
	
	private int pick;// variable for chosen position
	public int getPick() {// gets the choice of position of player
		return pick;
	}
	public void setPick(int pick) {// sets the choice of position of the player
		this.pick = pick;
	}

}
