package com.sunbeam;

public class Main {

	public static void main(String[] args) {
			Stack st = new Stack(5);
			st.push(10);
			st.push(20);
			st.push(30);
			
			int data = st.peek();
			System.out.println("Top element int the stack : " + data);
			
			st.push(40);
			st.push(50);
			st.pop();
			
			data = st.peek();
			System.out.println("Top element in the stack : " + data);
			
			Queue q  = new Queue(5);
			q.push(10);
			q.push(20);
			q.push(30);
			
			int data_que = q.peek();
			System.out.println("Top element int the stack : " + data_que);
			
			q.push(40);
			q.push(50);
			q.pop();
			
			data_que = q.peek();
			System.out.println("Top element in the stack : " + data_que);		
	}

}
