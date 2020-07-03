package com.koreait.second;

public class Utils {
	
	public static int parseStringToInt(String str, int num) {
		int result = num;
		try {
			result = Integer.parseInt(str);
			
		} catch(NumberFormatException e) {
			result = num;
		}
		return result;
	}
	
	
	public static int parseStringToInt(String str) {
		try {
			int realNum = Integer.parseInt(str);
			return realNum;
		} catch(NumberFormatException e) {
			return 0;
		}
	}
	
	
	public static void sortASC(int[] arr) {
//		int temp = 0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<i; j++) {
//				if(arr[i] < arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		
		sort(arr, true);
	}
	
	public static void printArr(int[] arr) {
		if(arr == null) {
			System.out.println("arr is null");
			return;
		}
		
		
		String str = "[";
		//System.out.print("[");
		for(int i=0; i<arr.length; i++) {
			//System.out.print((i == 0)? arr[i] : ", " + arr[i]);
			str += String.format((i==0) ? "%s" : ", %s", arr[i]);
			
		}
		str += "]";
		System.out.println(str);
		//System.out.println("]");
	}
	
	public static void sortDESC(int[] arr) {
//		int temp = 0;
//		for(int i=0; i<arr.length; i++) {
//			for(int j=0; j<i; j++) {
//				if(arr[i] < arr[j]) {
//					temp = arr[j];
//					arr[j] = arr[i];
//					arr[i] = temp;
//				}
//			}
//		}
		
		sort(arr, false);
	}
	
	public static void sort(int[] arr, boolean asc) {
		for(int i=0; i<arr.length-1; i++) {
			for(int j=i+1; j<arr.length; j++) {
				if(asc == (arr[i] > arr[j])) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}
	
	
	
	public static int[] createRandomArr(int min, int max, int len) {
//		int[] arr = new int[len];
//		
//		for(int i=0; i<len; i++) {
//			arr[i] = (int)(Math.random() * (max - min + 1)) + min;
//		}
//		
//		return arr;
		
		return randomArr(min, max, len, true);

	}
	
	
	public static int[] createRandomArrNoDuplication(int min, int max, int len) {
//		int[] arr = new int[len];
//		for(int i=0; i<len; i++) {
//			arr[i] = (int)(Math.random() * (max - min + 1)) + min;
//			for(int j=0; j<i; j++) {
//				if(arr[i] == arr[j]) {
//					i--;
//					break;					
//				}
//			}
//		}
//		
//		return arr;
		
		
		return randomArr(min, max, len, false);
	}
	
	
	
	private static int[] randomArr(int min, int max, int len, boolean result) {
		if(len > (max-min+1)) {
			return null;
		}
		
		int[] arr = new int[len];
		for(int i=0; i<len; i++) {
			arr[i] = (int)(Math.random() * (max - min + 1)) + min;
			if(!result) {
				for(int j=0; j<i; j++) {
					if(arr[i] == arr[j]) {
						i--;
						break;					
					}
				}
			}
		}
		return arr;
	}
	
	
	
	
	
}
