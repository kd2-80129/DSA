package com.sunbeam;

public class FirstNonRepeatingElement {

	public static int nonRepeatElement(int arr[]) {
		for(int i = 0 ; i < arr.length ; i++) {
			int count = 0;
			for(int j = i + 1 ; j < arr.length ; j++) {
				if(i != j) {
					if(arr[i] == arr[j])
						count++;
				}
			}
			if(count == 0)
				return i;
		}
		return -1;
	}
	
	public static void main(String[] args) {
		
		int arr[] = { 1, 2, 3, -1, 2, 1, 0, 4, -1, 7, 8 };
		
		int result = nonRepeatElement(arr);
		
		System.out.println("First Non-repeating element is :  " + arr[result]);
	}

}
