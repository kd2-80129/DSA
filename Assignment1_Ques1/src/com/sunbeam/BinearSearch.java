package com.sunbeam;

import java.util.Arrays;
import java.util.Scanner;

public class BinearSearch {

	public static int binarySearch(int arr[],int key) {
		int count = 0, left = 0 ,right = arr.length - 1;
		
		while(left <= right) {
			int mid = (left + right) / 2;
			count++;
			if(arr[mid] == key) {
				System.out.println("Count of comparisons is : " + count);
				return mid;	
			} else {
				if(arr[mid] > key)
					right = mid - 1;
				else
					left = mid + 1;
			}
		}
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = {12, 14, 45, 24 , 10, 8, 67};
		
		System.out.print("Enter the key to be searched : ");
		int key = scan.nextInt();
		
		Arrays.sort(arr);
		int result = binarySearch(arr, key);
		
		if(result != -1)
			System.out.println("The Index at which the key exists is : " + result);
		else
			System.out.println("key not found!!");
		scan.close();
	}

}
