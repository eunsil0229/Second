package com.koreait.second.blackjack;

public class Card {
	
	public final static String[] PATTERNS = { "♠", "♥", "♣", "◆" };
	private final String pattern;
	private final String denomination;
	private final int point;
	
	public Card(String pattern, String denomination, int point) {
		this.pattern = pattern;
		this.denomination = denomination;
		this.point = point;
	}
	
		
	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	public int getPoint() {
		return point;
	}
	
	
	@Override
	public String toString() {
		return String.format("%s %s\tPoint : %d", pattern, denomination, point);
	}

	
}
