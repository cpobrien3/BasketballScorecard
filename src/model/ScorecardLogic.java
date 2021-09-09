package model;
import java.text.DecimalFormat;

/**
 * @author Christian - cpobrien3
 * CIS175 - Fall 2021
 * Sep 7, 2021
 */
public class ScorecardLogic {
	
	/**
	 * Method that calculates the total amount of points a player has scored.
	 * @param player
	 * @return totalPoints - the total number of points a player has scored as a integer number.
	 */
	public int calculateTotalPointsScored(BasketballScorecard player) {
		int threePoints = 3;
		int twoPoints = 2;
		
		int totalPoints = (player.getTwoPointFG()* twoPoints) + (player.getThreePointFG() * threePoints) + player.getFreeThrows();
		return totalPoints;
	}
	
	/**
	 * Method that calculates the average amount of points a player scores each game.
	 * @param player
	 * @return average - the average amount of points as a double number, 
	 */
	public double calculatePointsPerGame(BasketballScorecard player) {
		double totalPoints = calculateTotalPointsScored(player);
		double average = totalPoints/player.getGamesPlayed();
		
		return average;
	}
	
	/**
	 * Method that calculates a player's shooting percentage (Amount of field goals made out of the total number of attempts).
	 * @param player
	 * @return FieldGoalPercentage - the percentage of field goals made as a String.
	 */
	public String calculateFGPercentage(BasketballScorecard player) {
		double totalShotsMade = player.getTwoPointFG() + player.getThreePointFG();
		double shotsAttempted = player.getFieldGoalsAttempted();
		
		DecimalFormat df = new DecimalFormat(".0");
		String FieldGoalPercentage = df.format(totalShotsMade/ shotsAttempted* 100) +"%";
		
		return FieldGoalPercentage;
	}
}
