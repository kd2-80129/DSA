package com.sunbeam;

public class Stack {
	private LinkedList list;
	private int size, top;

	public Stack(int size) {
		this.size = size;
		list = new LinkedList();
		top = 0;
	}

	public boolean isFull() {
		return top == size;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void push(int data) {
		if (isFull())
			System.out.println("Stack is full");
		else {
			list.addFirst(data);
			top++;
		}
	}

	public void pop() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else {
			list.delFirst();
			top--;
		}
	}

	public int peek() {
		if(isEmpty())
			System.out.println("Stack is empty");
		else
			return list.firstEle();
		return -1;
	}
}
