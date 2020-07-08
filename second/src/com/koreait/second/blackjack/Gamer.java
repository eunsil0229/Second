package com.koreait.second.blackjack;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

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
	
	public void moreCards(CardDeck cd) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("[게이머 카드 오픈]");
		openCards();
		System.out.println();
		
		while(getTotalPoint() < 21) {			
			System.out.print("히트(1) or 스탠드(2) 선택하세요 > ");
			String choice = scanner.next();
			System.out.println();
			
			if(!choice.equals("1") && !choice.equals("2")) {
				System.out.println("다시 선택해주세요.\n");
				continue;
			} else if(choice.equals("2")) {
				scanner.close();
				return;
			}
			
			receiveCard(cd.getCard());
			openCards();
			System.out.println();	
		}
	}
	

	
	
	
}
