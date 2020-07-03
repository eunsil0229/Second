package com.koreait.second;

public class gugudan {
	public static void main(String[] args) {
		
		gugudan(2, 5);
		
		int sum = sum(1, 2); //3
		System.out.println(sum);
		sum = sum(1, 2, 3); //6
		System.out.println(sum);
		sum = sum(1, 2, 3, 4, 6, 7); //
		System.out.println(sum);
		
		System.out.println("-----------------------------");
		int result = Utils.parseStringToInt("10", 0); //10 정수값 리턴
		System.out.println(result);
		result = Utils.parseStringToInt("aa10", 1);
		
		System.out.println(result);
		
		result = Utils.parseStringToInt("aa10");
		
		System.out.println(result);
		
		result = Utils.parseStringToInt("9");
		
		System.out.println(result);
		System.out.println("-----------------------------");
		
		int[] arr = {4, 5, 11, 223, 3, 10};
		Utils.sortASC(arr); // 오름차순 정렬
		Utils.printArr(arr); // [3, 4, 5, 10, 11, 223]
		Utils.sortDESC(arr); // 내림차순 정렬
		Utils.printArr(arr);
		
		System.out.println("-----------------------------");
		
		int[] rArr = Utils.createRandomArr(5, 15, 1000); // 1 ~ 9 랜덤한 값을 5칸 가지는 정수형 배열을 리턴하시오오오오ㅓ옹오오오오
		Utils.printArr(rArr);
		
		
		rArr = Utils.createRandomArrNoDuplication(5, 15, 11); //중복안됨
		Utils.printArr(rArr);
		
		System.out.println("-----------------------------");
		
		String star = makeStarTriangle(5);
		System.out.println(star);
		
		

		
		
		
		
		
		
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
	
	
	public static int sum(int... args) {
		int sum = 0;
		
		for(int i=0; i<args.length; i++) {
			sum += args[i];
		}
		
		return sum;
	}
	
	
	public static String makeStarTriangle(int starNum) {
		String str = "";
		
		for(int i=0; i<starNum; i++) {
			for(int j=0; j<=i; j++) {
				str += "*";
			}
			str += "\n"; 
		}
		
		
		return str;
	}
	
	
	
	
	
}
