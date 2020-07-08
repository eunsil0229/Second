package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();

	public CardDeck() {
		init();
	}
	
	private void init() {
		for(int i=0; i<Card.PATTERNS.length; i++) {
			for(int z=1; z<=13; z++) {
				//arr.add(new Card(Card.PATTERNS[i], getDeno(z)));
				String pattern = Card.PATTERNS[i];
				String deno = getDeno(z);
				int point = getPoint(z);
				Card c = new Card(pattern, deno, point);
				arr.add(c);
			}
		}
	}
	
	private int getPoint(int num) {
		return num > 10 ? 10 : num;
	}
	
	private String getDeno(int num) {
		switch(num) {
		case 1: return "A";
		case 11: return "J";
		case 12: return "Q";
		case 13: return "K";
		default: return String.valueOf(num);
		}
	}
	
	
	@Override
	public String toString() {
		
		String str = "";
		
		for(Card cd : arr) {
			str += cd;
			
			//System.out.println(cd); return을 ""로 해주는 얍삽스
			
			// str += String.format("p : %s, d : %s\n", cd.getPattern(), cd.getDenomination());
		}
		
		return str;
		
		//return arr.toString();
	}	
	
	
	public Card getCard() {
		int num = (int)(Math.random() * arr.size());	
		return arr.remove(num);
		
//		int num = (int)(Math.random() * 52);
//		for(int i=0; i<arr.size(); i++) {
//			Card cd = arr.get(num);
//			arr.remove(num);
//			arr.add(i, cd);
//
//		}
		
	}
	
	
	
	
	
	
}
