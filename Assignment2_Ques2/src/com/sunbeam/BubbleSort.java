package com.sunbeam;

import java.util.Arrays;

public class BubbleSort {

	public static int bubbleSort(int arr[], int N) {
		int count_comparisions = 0;
		for (int i = 1; i < N; i++) {
			int flag = 0;
			for (int j = 0; j < N - i; j++) {
				count_comparisions++;
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0)
				return count_comparisions;
		}
		return count_comparisions;
	}

	public static void main(String[] args) {
		int arr[] = { 10, 5, 79, 30, 11, 2, 65 };
		//int arr[] = {33, 22, 66, 55, 44, 11};

		System.out.println("Array before Sort : " + Arrays.toString(arr));

		int count = bubbleSort(arr, arr.length);

		System.out.println("Array after Sort : " + Arrays.toString(arr));
		System.out.println("No. of comparisions is : " + count);
	}

}
