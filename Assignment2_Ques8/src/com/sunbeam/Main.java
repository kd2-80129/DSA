package com.sunbeam;

import java.util.Scanner;

public class Main {

	public static int menu(Scanner scan) {
		int choice;
		
		System.out.println("0. Exit");
		System.out.println("1. Add data");
		System.out.println("2. Delete data");
		System.out.println("3. Peek data");
		System.out.print("Enter your choice : ");
		choice = scan.nextInt();
		
		return choice;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice;
		CircularQueue queue = new CircularQueue(5);
		
		while((choice = menu(scan)) != 0) {
			switch(choice) {
			case 1://add data
				System.out.print("Enter data : ");
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
				System.out.println("Invalid choice...Try again!!");
				break;
			}
		}

	}

}
