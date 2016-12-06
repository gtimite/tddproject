package com.tddProject.test;

//import com.tddProject.test.FootballTeam;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class FootballTeamTest {
	
	private static final int THREE_GAMES_WON = 3;
	private static final int ANY_NUMBER = 100;
	
	@Test
	public void constructorShouldSetGamesWon(){
		FootballTeam footballTeam = new FootballTeam(THREE_GAMES_WON);
		assertEquals("Three games passed to the constructor, but "+ footballTeam.gameWon() +" were returned",THREE_GAMES_WON,footballTeam.gameWon());
	}
	
	
	@Test
	public void shouldBePossibleToCompareTeams(){
		FootballTeam team =  new FootballTeam(ANY_NUMBER);
		assertTrue("FootballTeam should implements Comparable",team instanceof Comparable);
	}
	
	@Test
	public void teamWithMoreMatchesWonShouldBeGreater(){
		FootballTeam team_1 = new FootballTeam(8);
		FootballTeam team_2 = new FootballTeam(3);
		assertTrue(team_1.compareTo(team_2) > 0);
	}

}
