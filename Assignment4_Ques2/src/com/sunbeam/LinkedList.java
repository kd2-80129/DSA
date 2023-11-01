package com.sunbeam;

public class LinkedList {
	public class Node{
		private int data;
		private Node next;
		
		public Node(int data) {
			this.data = data;
			next = null;
		}
	}
	
	private Node tail;

	public LinkedList() {
		tail = null;
	}
	//isEmpty
	public boolean isEmpty() {
		return tail == null;
	}
	//Add first
	public void addFirst(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			tail = node;
			node.next = tail;
		}
		else {
			node.next = tail.next;
			tail.next = node;
		}	
	}
	//add Last 
	public void addLast(int data) {
		Node node = new Node(data);
		if(isEmpty()) {
			tail = node;
			node.next = tail;
		}
		else {
			tail.next = node;
			tail = node;
		}
	}
	//delete first
	public void delFirst() {
		if(isEmpty())
			System.out.println("List is Empty");
		else
			tail.next = tail.next.next;
	}
	//Delete last
	public void delLast() {
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav = tail.next;
			while(trav.next != tail) 
				trav = trav.next;
			trav.next = trav.next.next;
			tail = trav;
		}
	}
	//Display
	public void display() {
		if(isEmpty())
			System.out.println("List is Empty!!");
		else {
			Node trav = tail;
			do {
				System.out.print(trav.data + " ");
				trav = trav.next;
			}
			while(trav != tail);
			System.out.println();
		}
	}
}
