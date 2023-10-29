package com.sunbeam;

import java.util.Scanner;

public class Main {

	static int menu(Scanner scan) {
		int choice = 0;
		
		System.out.println("0. Exit");
		System.out.println("1. Add data");
		System.out.println("2. Delete data");
		System.out.println("3. Peek data");
		System.out.print("Enter Your choice : ");
		choice = scan.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		StackDesc stk = new StackDesc(5);
		
		int choice;
		while((choice = menu(scan)) != 0) {
			switch(choice) {
			case 1://add data
				System.out.print("Enter data to push : ");
				int data = scan.nextInt();
				stk.push(data);
				break;
			case 2://delete data
				int data1 = stk.pop();
				System.out.println("Popped data : " + data1);
				break;
			case 3://peek data
				data1 = stk.peek();
				System.out.println("Peeked data : " + data1);
				break;
			default:
				System.out.println("Invalid choice...Try again!!");
				break;
			}
		}
		
		scan.close();
		
		

	}

}
