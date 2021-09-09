package model;


/**
 * @author Christian O'Brien - cpobrien3
 * CIS175 - Fall 2021
 * Sep 7, 2021
 */
public class BasketballScorecard {
	//Declare instance variables 
	private String name;
	private int freeThrows;
	private int twoPointFG;
	private int threePointFG;
	private int gamesPlayed;
	private int fieldGoalsAttempted;
	
	//Default no-arg constructor
	public BasketballScorecard() {
			
	}
	
	//Non-default constructor
	public BasketballScorecard(String name) {
		
	}
	
	//Generate getters/setters.
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getFreeThrows() {
		return freeThrows;
	}
	public void setFreeThrows(int freeThrows) {
		this.freeThrows = freeThrows;
	}
	public int getTwoPointFG() {
		return twoPointFG;
	}
	public void setTwoPointFG(int twoPointFG) {
		this.twoPointFG = twoPointFG;
	}
	public int getThreePointFG() {
		return threePointFG;
	}
	public void setThreePointFG(int threePointFG) {
		this.threePointFG = threePointFG;
	}
	public int getGamesPlayed() {
		return gamesPlayed;
	}
	public void setGamesPlayed(int gamesPlayed) {
		this.gamesPlayed = gamesPlayed;
	}

	public int getFieldGoalsAttempted() {
		return fieldGoalsAttempted;
	}

	public void setFieldGoalsAttempted(int fieldGoalsAttempted) {
		this.fieldGoalsAttempted = fieldGoalsAttempted;
	}
	
	
}
