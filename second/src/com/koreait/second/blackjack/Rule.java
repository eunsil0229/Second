package com.koreait.second.blackjack;

public class Rule {
	
	public static void whoIsWin(Gamer gamer, Dealer dealer) {
		int gamerPoint = gamer.getTotalPoint();
		int dealerPoint = dealer.getTotalPoint();
		int maxPoint = 21;
		String name = "딜러";

		
		if(gamerPoint <= maxPoint) {
			if(gamerPoint > dealerPoint || dealerPoint > maxPoint) {
				name = "게이머";
			} else if(gamerPoint == dealerPoint) {
				System.out.println("비겼습니다!");
				return;
			}
		} else {
			System.out.println("게이머 버스트!!");
		}
		
		System.out.printf("%s가 승리했습니다!\n", name);
	}

}
