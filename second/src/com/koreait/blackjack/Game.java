package com.koreait.blackjack;

public class Game {
	public static void main(String[] args) {

		CardDeck cd = new CardDeck();
		Card c = cd.getCard();
		
		Gamer gamer = new Gamer();
		Dealer dealer = new Dealer();
		
		dealer.moreCards(cd);
		dealer.openCards();
		
		System.out.println("----------");
		
		dealer.receiveCard(cd.getCard());
		
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		gamer.receiveCard(cd.getCard());
		
		gamer.openCards();
	}

}
