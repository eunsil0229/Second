package com.koreait.blackjack;

import java.util.ArrayList;
import java.util.List;

public class CardDeck {
	private List<Card> arr = new ArrayList();

	public CardDeck() {
		
		// String[] cards = {"A", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J",
		// "Q", "K"};

		for (int i = 0; i < Card.PATTERNS.length; i++) {
			for (int j = 1; j <= 13; j++) {
				String cardnum = "";
				
				switch (j) {
				case 1:
					cardnum = "A"; break;
				case 11:
					cardnum = "J"; break;
				case 12:
					cardnum = "Q"; break;
				case 13:
					cardnum = "K"; break;
				default:
					cardnum = String.valueOf(j); break;
				}
				
				arr.add(new Card(Card.PATTERNS[i], cardnum));
			}

		}
	}
}
