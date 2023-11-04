package com.sunbeam;

public class DoublyCircularLinkedList {
	class Node {
		private int data;
		private Node prev, next;

		public Node(int value) {
			this.data = value;
			prev = next = null;
		}
	}

	private Node head;

	public DoublyCircularLinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev = newNode;
			head = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
		} else {
			newNode.next = head;
			newNode.prev = head.prev;
			head.prev.next = newNode;
			head.prev = newNode;
		}
	}
	
	public void addAtPosition(int value, int pos) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
			newNode.prev = newNode;
			newNode.next = newNode;
		} 
		else if(pos <= 1)
			addFirst(value);
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++) 
				trav = trav.next;
			newNode.next = trav.next;
			newNode.prev = trav;
			trav.next.prev = newNode;
			trav.next = newNode;
		}
	}

	public void delFirst() {
		if (isEmpty())
			System.out.println("List is empty");
		else {
			head.next.prev = head.prev;
			head.prev.next = head.next;
			head = head.next;
		}
	}
	
	public void delLast() {
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			head.prev.prev.next = head;
			head.prev = head.prev.prev;
		}
	}
	
	public void delAtPosition(int pos) {
		if (isEmpty()) 
			System.out.println("List is Empty");
		else if(pos <= 1)
			delFirst();
		else {
			Node trav = head;
			for(int i = 1 ; i < pos - 1 ; i++) 
				trav = trav.next;
			trav.next = trav.next.next;
			trav.next.prev = trav;
		}
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav = head;
			System.out.print("List : ");
			do {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			while(trav != head);			
		}
	}
}
