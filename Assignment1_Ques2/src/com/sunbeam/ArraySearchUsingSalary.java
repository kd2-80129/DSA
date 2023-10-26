package com.sunbeam;

import java.util.Scanner;

public class ArraySearchUsingSalary {

	public static int linearSearch(Employee arr[], double key) {
		for(int i = 0 ; i < arr.length ; i++) {
			if(arr[i].getSalary() == key)
				return i;
		}		
		return -1;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Employee arr[] = new Employee[5];
		
		arr[0] = new Employee(1, "Shikhar", 9000.567);
		arr[1] = new Employee(2, "Bhanu", 15000.987);
		arr[2] = new Employee(3, "Abhey", 5000.789);
		arr[3] = new Employee(4, "Ashish", 6000.456);
		arr[4] = new Employee(5, "Prajwal", 2000.234);

		System.out.print("Enter Emp Salary to Search for employee : ");
		double key = scan.nextDouble();
		
		int result = linearSearch(arr,key);
		
		if(result != -1) {
			System.out.println("The Employee is at index " + result);
			System.out.println(arr[result]);
		} else
			System.out.println("Key not Found!!");
		scan.close();
	}

}
