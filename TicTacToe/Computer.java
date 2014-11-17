/**
 * This class will allow the computer to make a move
 * @author Frederick Wilson
 * @since Mar 18, 2014
 * Note: This class picks a random position for the computer to place on the board
 */

package TicTacToe;

import java.util.Random;

public class Computer {
	Random rand = new Random();// creates random generator object
	private int pick1 = rand.nextInt(9);//position choice
	public int getPickCpu() {// gets the pick chosen by the computer
		return pick1;
	}
	public void setPickCpu(int pick) {// sets the pick of the computer
		this.pick1 = pick;
	}
}