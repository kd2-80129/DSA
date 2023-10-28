package com.sunbeam;

import java.util.Arrays;

public class InsertionSort {

	public static int insertionSort(int arr[], int N) {
		int count = 0;
		for (int i = 1; i < N; i++) {
			int temp = arr[i];
			int j = i;
			count++;
			while (j >= 1 && arr[j - 1] > temp) {
				arr[j] = arr[j - 1];
				j--;
			}
			arr[j] = temp;
		}
		return count;
	}

	public static void main(String[] args) {
		int arr[] = {33, 22, 66, 55, 44, 11};
		System.out.println("Array before sort : " + Arrays.toString(arr));
		int count = insertionSort(arr, arr.length);
		System.out.println("No. of comparisions : " + count);
		System.out.println("Array after sort : " + Arrays.toString(arr));
	}

}
