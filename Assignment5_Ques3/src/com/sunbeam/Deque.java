package com.sunbeam;

public class Deque {
	private LinkedList list;
	private int size, top;
	
	Deque(int size){
		list = new LinkedList();
		this.size = size;
		top = 0;
	}
	
	public boolean isFull() {
		return top == size;
	}
	
	//Checks whether the deque is empty or not. --> O(1)
	public boolean isEmpty() {
		return top == 0;
	}
	
	//Inserts the element at the beginning. --> O(1)	
	public void push_front(int data) {
		if(isFull())
			System.out.println("Deque is full");
		else {
			list.addFirst(data);
			top++;
		}
	}
	
	//Adds element at the end. --> O(1)
	public void push_back(int data) {
		if(isFull())
			System.out.println("Deque is full");
		else {
			list.addLast(data);
			top++;
		}
	}
	
	//Removes the first element from the deque. --> O(1)
	public void pop_front() {
		if(isEmpty())
			System.out.println("Deque is empty");
		else {
			list.delFirst();
			top--;
		}
	}
		
	//Removes the last element from the deque. --> O(1)
	public void pop_back() {
		if(isEmpty())
			System.out.println("Deque is empty");
		else { 
			list.delLast();
			top--;
		}
	}
		
	//Gets the front element from the deque. --> O(1)	
	public int front() {
		return list.getFront();
	}

	//Gets the last element from the deque. --> O(1)
	public int back() {
		return list.getBack();
	}
	
	//Determines the number of elements in the deque. --> O(1)
	public int size() 	{
		 	return size;
	}
	
	public void display() {
		list.display();
	}
	
}
