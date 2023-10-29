package com.sunbeam;

public class StackDesc {
	private int top;
	public final int SIZE;
	public int arr[];
	
	public StackDesc(int size) {
		this.SIZE = size;
		top = size;
		arr = new int[size];
	}
	
	public void push(int data) {
		if(isFull()) 
			System.out.println("Stack is full");
		else {
			top--;
			arr[top] = data;
		}
	}
	
	public int pop() {
		if(isEmpty())
			System.out.println("Stack is Empty");
		else {
			int temp = arr[top];
			top++;
			return temp;
		}
	return -1;
	}
	
	public int peek() {
		if(isEmpty())
			System.out.println("Stack is Empty!!");
		else 
			return arr[top];
		return -1;
	}
	
	public boolean isFull() {
		return top == 0;
	}
	
	public boolean isEmpty() {
		return top == SIZE;
	}
}
