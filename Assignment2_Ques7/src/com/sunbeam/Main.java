package com.sunbeam;

import java.util.Scanner;

public class Main {

	public static int menu(Scanner scan) {
		int choice = 0;
		
		System.out.println("0. Exit");
		System.out.println("1. Add data");
		System.out.println("2. Delete data");
		System.out.println("3. peek data");
		System.out.print("Enter Your choice");
		choice = scan.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		LinearQueue queue = new LinearQueue(5);
		int choice;
		Scanner scan = new Scanner(System.in);
		
		while((choice = menu(scan)) != 0) {
			switch(choice) {
			case 1://add data
				System.out.print("Enter data to push : ");
				int data = scan.nextInt();
				queue.push(data);
				break;
			case 2://delete data
				queue.pop();
				break;
			case 3://peek data
				data = queue.peek();
				System.out.println("Peeked data : " + data);
				break;
			default:
				System.out.println("Invalid choice...Try Again!!");
				break;
				
			}
		}
		scan.close();
	}
}
