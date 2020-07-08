package com.koreait.second.cafe;

public class Cafe {
	public static void main(String[] args) {
		
//		MenuItem mi1 = new MenuItem("아메리카노", 1500);
//		MenuItem mi2 = new MenuItem("카푸치노", 2000);
//		MenuItem mi3 = new MenuItem("캬라멜 마끼야또", 2000);
//		System.out.println(mi1);
//		System.out.println(mi2);
//		System.out.println(mi3);
		
		
		Menu menu = new Menu();
		menu.showMenus();
		
		MenuItem mi = menu.choose(0);
		System.out.println(mi);

	}

}
