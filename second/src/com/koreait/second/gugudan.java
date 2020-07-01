package com.koreait.second;

public class gugudan {
	public static void main(String[] args) {
		
		gugudan(2, 5);
	}

	public static void gugudan(int n1, int n2) {
		for(int i=n1; i <= n2; i++) {
			System.out.printf("<<<<%d단>>>>\n", i);
			for(int j=1; j<10; j++) {
				int result = i*j;
				if(result % 2 == 0) {
					System.out.printf("%d * %d = %d\n", i, j, result);
				}
			}
			System.out.println();
		}
	}
}
