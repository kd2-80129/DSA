package com.sunbeam;

public class LinearQueue {
	private final int  SIZE;
	private int front;
	private int rear;
	private int arr[];
	
	public LinearQueue(int size) {
		this.SIZE = size;
		this.front = 0;
		this.rear = 0;
		arr = new int[size];
	}
	
	public void push(int data) {
		if(isFull())
			System.out.println("Queue is Full");
		else {
			arr[rear] = data;
			rear++;
		}
	}
	
	public void pop() {
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
			front++;
	}
	
	public int peek() {
		if(isEmpty())
			System.out.println("Queue is Empty");
		else
			return arr[front];
		return -1;
	}
	
	public boolean isFull() {
		return rear == SIZE;
	}
	
	public boolean isEmpty() {
		return rear == front;
	}
}
