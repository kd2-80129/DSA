package com.sunbeam;

public class Main {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		
		list.addFirst(10);
		list.addFirst(20);
		list.addFirst(30);
		list.addFirst(40);
		//list.addFirst(50);
		list.display();
		
//		list.delFirst();
//		
//		list.display();
//		
//		list.delLast();
//		
//		list.display();
		
		int result = list.findMiddleEle();
		System.out.println("Middle Element : " + result);
	}

}
