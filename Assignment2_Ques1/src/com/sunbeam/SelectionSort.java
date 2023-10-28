package com.sunbeam;

import java.util.Arrays;

public class SelectionSort {

	public static void selectionSort(int arr[], int N) {
		int count_passes = 0, count_comparisions = 0;
		for(int i = 0 ; i < N - 1 ; i++) {
			count_passes++;
			for(int j = i + 1 ; j < N ; j++) {
				count_comparisions++;
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		System.out.println("No. of passes : " + count_passes + ", No. of comparisions :  " + count_comparisions);
	}
	
	public static void main(String[] args) {
	int arr[] = {10, 5, 79, 30, 11, 2, 65};
	
	System.out.println("Array before Sort : " + Arrays.toString(arr));
	
	selectionSort(arr, arr.length);

	System.out.println("Array after Sort : " + Arrays.toString(arr));
	}

}
