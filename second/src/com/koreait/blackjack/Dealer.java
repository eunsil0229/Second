package com.koreait.blackjack;

public class Dealer extends Gamer {
	
	public void moreCards(CardDeck cd) {
		while(true) {
			int totalPoint = getTotalPoint();
			if(totalPoint >= 17) {
				return;
			}
			
			receiveCard(cd.getCard());
		}
	}

}
