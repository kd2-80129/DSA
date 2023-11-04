package com.sunbeam;

public class Queue {
	private LinkedList list;
	private int size, top;

	Queue(int size) {
		this.size = size;
		top = 0;
		list = new LinkedList();
	}

	public boolean isFull() {
		return size == top;
	}

	public boolean isEmpty() {
		return top == 0;
	}

	public void push(int data) {
		if (isFull())
			System.out.println("Queue is full");
		else {
			list.addLast(data);
			top++;
		}
	}
	
	public void pop() {
		if (isEmpty())
			System.out.println("Queue is empty");
		else {
			list.delFirst();
			top--;
		}
	}
	
	public int peek() {
		return list.firstEle();
	}

}
