package com.sunbeam;

import java.util.Scanner;

public class LinearSearch {

	public static int linearSearch(int arr[], int key) {
		int count = 0;		
		for(int i = 0 ; i < arr.length ; i++) {
			count++;
			if(arr[i] == key) {
				System.out.println("Count of comparisions is : " + count);
				return i;
			}
		}			
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {12, 14, 45, 24 , 10, 8, 67};
		
		System.out.print("Enter the key to be searched : ");
		int key = scan.nextInt();
		int result = linearSearch(arr, key);
		
		if(result != -1)
			System.out.println("The Index at which the key exists is : " + result);
		else
			System.out.println("key not found!!");
		scan.close();
	}

}
