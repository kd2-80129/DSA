package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addLast(10);
		list.addLast(20);
		list.addLast(30);
		list.addLast(40);
		list.addLast(50);
		
		System.out.print("Forward Display : ");
		list.display();
		
		System.out.print("Reverse Display : ");
		list.reverse();
		list.display();
				
		
	}

}
