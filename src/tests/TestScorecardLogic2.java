package tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import model.BasketballScorecard;
import model.ScorecardLogic;

/**
 * @author Christian - cpobrien3
 * CIS175 - Fall 2021
 * Sep 7, 2021
 */
public class TestScorecardLogic2 {

	ScorecardLogic scorecard = new ScorecardLogic();
	BasketballScorecard player2 = new BasketballScorecard("Alex");
	
	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
	}

	//Test for the calculateTotalPointsScored() method.
	@Test
	public void testPointsScored() {
		player2.setTwoPointFG(25);
		player2.setThreePointFG(9);
		player2.setFreeThrows(13);
		double totalPoints = scorecard.calculateTotalPointsScored(player2);
		assertEquals(90, totalPoints, 0.0);
	}

	//Test for the calculatePointsPerGame() method.
	@Test
	public void testPointsPerGame() {
		player2.setTwoPointFG(25);
		player2.setThreePointFG(9);
		player2.setFreeThrows(13);
		player2.setGamesPlayed(5);
		double averagePoints  = scorecard.calculatePointsPerGame(player2);
		assertEquals(18,averagePoints, 0.0);
	}
	
	//Test for the calculateFGPercentage() method.
	@Test
	public void testFGPercentage() {
		player2.setTwoPointFG(25);
		player2.setThreePointFG(9);
		player2.setFieldGoalsAttempted(60);
		String percentage = scorecard.calculateFGPercentage(player2);
		assertEquals("56.7%",percentage);
	}
}
