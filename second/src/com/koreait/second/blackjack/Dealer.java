package com.koreait.second.blackjack;

public class Dealer extends Gamer {
	
	@Override
	public void moreCards(CardDeck cd) {
//		while(true) {
//			int totalPoint = getTotalPoint();
//
//			if(totalPoint >= 17) {
//				return;
//			}
//			
//			receiveCard(cd.getCard());
//		}
		
		int stopPoint = 17;
		while(getTotalPoint() < stopPoint) {
			receiveCard(cd.getCard());
		}
		
		System.out.println("[딜러 카드 오픈]");
		openCards();
		System.out.println();
	}

}
