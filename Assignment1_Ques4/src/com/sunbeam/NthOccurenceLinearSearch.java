package com.sunbeam;

import java.util.Scanner;

public class NthOccurenceLinearSearch {

	public static int linearSearch(int arr[],int key, int n) {
		int count = 0;
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i] == key) {
				count++;
				if(count == n)
					return i;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {1, 3, 4, 1, 4, 8, 0, 4, 7, 4};
		
		System.out.print("Enter the key & occurence : ");
		int key = scan.nextInt();
		int ocurence = scan.nextInt();
		
		int result = linearSearch(arr, key, ocurence);
		
		System.out.println("The " + ocurence + "th occurence of " + key + " is at index : " + result);
	
		scan.close();
	}

}
