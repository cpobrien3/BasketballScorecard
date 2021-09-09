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
public class TestScorecardLogic1 {

	ScorecardLogic scorecard = new ScorecardLogic();
	BasketballScorecard player1 = new BasketballScorecard("Christian");
	
	@Before
	public void setUp() throws Exception {
	}

	//Test for the calculateTotalPointsScored() method.
	@Test
	public void testPointsScored() {
		player1.setTwoPointFG(18);
		player1.setThreePointFG(5);
		player1.setFreeThrows(7);
		double totalPoints = scorecard.calculateTotalPointsScored(player1);
		assertEquals(58, totalPoints, 0.0);
	}

	@Test
	//Test for the calculatePointsPerGame() method.
	public void testPointsPerGame() {
		player1.setTwoPointFG(18);
		player1.setThreePointFG(5);
		player1.setFreeThrows(7);
		player1.setGamesPlayed(4);
		double averagePoints  = scorecard.calculatePointsPerGame(player1);
		assertEquals(14.5,averagePoints, 0.0);
	}
	
	@Test
	//Test for the calculateFGPercentage() method.
	public void testFGPercentage() {
		player1.setTwoPointFG(18);
		player1.setThreePointFG(5);
		player1.setFieldGoalsAttempted(50);
		String percentage = scorecard.calculateFGPercentage(player1);
		assertEquals("46.0%",percentage);
	}
}
