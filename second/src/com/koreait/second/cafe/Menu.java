package com.koreait.second.cafe;

import java.util.ArrayList;
import java.util.List;

public class Menu {
	private List<MenuItem> arr = new ArrayList();
//	private String[] coffee = {"아메리카노", "카푸치노", "카페라떼", "캬라멜 마끼야또"};
//	private int[] price = {1500, 2000, 2000, 2500};
	
	public Menu() {		
		init();
	}
	
	private void init() {
		arr.add(new MenuItem("아메리카노", 1500));
		arr.add(new MenuItem("카푸치노", 2000));
		arr.add(new MenuItem("카페라떼", 2000));
		arr.add(new MenuItem("캬라멜 마끼야또", 2500));
		
//		for(int i=0; i<arr.size(); i++) {
//			arr.add(new MenuItem(coffee[i], price[i]));
//		}
	}
	
	
	public void showMenus() {
		System.out.printf("%15s\n", "<<메뉴>>");
		for(int i=0; i<arr.size(); i++) {
			System.out.printf("%d. %s\n", (i+1), arr.get(i));			
		}
	}
	
	
	public MenuItem choose(int idx) {
		return arr.get(idx);
	}
	
	

	
	
	
	
}
