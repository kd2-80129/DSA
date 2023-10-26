package com.sunbeam;

import java.util.Scanner;

public class RankOfElement {

	public static int elementRank(int arr[], int key) {
		int rank = 0;
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] == key || key > arr[i])
				rank++;
		}
		return rank;
	}

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int arr[] = { 10, 20, 15, 3, 4, 4, 1 };

		System.out.print("Enter the element whose rank to be find : ");
		int key = scan.nextInt();
		
		int rank = elementRank(arr, key);
		System.out.println("Rank of element : " + key + " is : " + rank);
		
		scan.close();
	}

}
