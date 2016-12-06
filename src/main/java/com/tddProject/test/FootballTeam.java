package com.tddProject.test;

public class FootballTeam implements Comparable<FootballTeam> {

	private int gamesWon;
	
	public FootballTeam(int gamesWon) {
		this.gamesWon = gamesWon;
	}

	public int gameWon() {
		
		return gamesWon;
	}

	public int compareTo(FootballTeam o) {
		int gamesToCompare = o.getGameWon();
		if(gamesWon > gamesToCompare)
			return 1;
		else if(gamesWon < gamesToCompare){
			return -1;
		}else{
			return 0;
		}
	}

	private int getGameWon() {
		// TODO Auto-generated method stub
		return this.gamesWon;
	}

}
