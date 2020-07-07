package com.koreait.blackjack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Gamer {
	
	private List<Card> gamerArr;

	public Gamer() {
		gamerArr = new LinkedList();
	}
	
	
	public void receiveCard(Card cd) {
		gamerArr.add(cd);
	}
	
	public void openCards() {
		for(Card card : gamerArr) {
			System.out.println(card);
		}
		System.out.println("점수 : " + getTotalPoint());
	}
	
	public int getTotalPoint() {
		int sum = 0;
		for(Card card : gamerArr) {
			sum += card.getPoint();
		}
		
		return sum;
	}
	

}
