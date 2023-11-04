package com.sunbeam;

public class LinkedList {
	class Node {
		private int data;
		private Node next;

		public Node(int value) {
			this.data = value;
			next = null;
		}
	}

	private Node head;

	public LinkedList() {
		head = null;
	}

	public boolean isEmpty() {
		return head == null;
	}

	public void addFirst(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			newNode.next = head;
			head = newNode;
		}
	}

	public void addLast(int value) {
		Node newNode = new Node(value);
		if (isEmpty()) {
			head = newNode;
		} else {
			Node trav = head;
			while(trav.next != null)
				trav = trav.next;
			trav.next = newNode;
		}
	}
	
	public void delFirst() {
		if (isEmpty())
			System.out.println("List is empty");
		else {
			head = head.next;
		}
	}
	
	public void delLast() {
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav = head;
			while(trav.next.next != null)
				trav = trav.next;
			trav.next = null;
		}
	}
	
	public int firstEle() {
		return head.data;
	}
	
	public void display() {
		if(isEmpty())
			System.out.println("List is Empty");
		else {
			Node trav = head;
			System.out.print("List : ");
			while(trav != null) {
				System.out.print(" " + trav.data);
				trav = trav.next;
			}
			System.out.println(" ");
		}
	}
}
