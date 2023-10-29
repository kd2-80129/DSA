package com.sunbeam;

import java.util.Arrays;

public class SortBySalary {
	
	public static void sortBySalary(Employee arr[], int N) {
		
		for(int i = 1; i < N ;i++) {
			Employee temp = arr[i];
			int j = i;
			while(j >=  1 && arr[j-1].getSalary() > temp.getSalary()) {
				arr[j] = arr[j-1];
				j--;
			}
			arr[j] = temp;
		}
	}
	
	public static void main(String[] args) {
		Employee arr[] = new Employee[5];
		
		arr[0] = new Employee(1, "Shikhar", 9000.234);
		arr[1] = new Employee(2, "Bhanu", 2000.234);
		arr[2] = new Employee(3, "Abhey", 4000.234);
		arr[3] = new Employee(4, "Prajwal", 5000.234);
		arr[4] = new Employee(5, "Nishant", 7000.234);
		
		System.out.println("Array before Sort : ");
		for(Employee ele : arr)
			System.out.println(ele);
		
		sortBySalary(arr, arr.length);
		
		System.out.println();
		System.out.println("Array after Sort : ");
		for(Employee ele : arr)
			System.out.println(ele);
	
	}
}
