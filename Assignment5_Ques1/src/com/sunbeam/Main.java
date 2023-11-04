package com.sunbeam;

public class Main {

	public static void main(String[] args) {
			DoublyCircularLinkedList list = new DoublyCircularLinkedList();
			
			list.addLast(10);
			list.addLast(20);
			list.addLast(30);
			list.addLast(40);
			list.addLast(50);
			list.addAtPosition(15, 2);
			list.addAtPosition(25, 4);
			list.delAtPosition(2);
			list.delAtPosition(3);
			
			list.display();
	}

}
