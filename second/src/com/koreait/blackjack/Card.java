package com.koreait.blackjack;

public class Card {
	
	public final static String[] PATTERNS = { "스페이드", "하트", "에이스", "클로버" };
	private final String pattern;
	private final String denomination;
	
	
	public Card(String pattern, String denomination) {
		this.pattern = pattern;
		this.denomination = denomination;
	}
	
		
	public String getPattern() {
		return pattern;
	}
	
	public String getDenomination() {
		return denomination;
	}
	
	
	@Override
	public String toString() {
		return String.format("p : %s, d : %s", pattern, denomination);
	}

	
}
