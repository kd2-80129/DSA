package com.sunbeam;

import java.util.Scanner;

public class PriorityOperator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Enter Operator : ");
		String operator = scan.next();
		int result = 0;

		switch (operator) {
		case "+":
			result = 3;
			break;
		case "-":
			result = 3;
			break;
		case "*":
			result = 2;
			break;
		case "/":
			result = 1;
			break;
		default:
			System.out.println("Invalid choice...Try again!!");
			break;
		}
		
		if(result > 0)
			System.out.println("Priority of the given operator is : " + result);
		
		scan.close();
	}
}
