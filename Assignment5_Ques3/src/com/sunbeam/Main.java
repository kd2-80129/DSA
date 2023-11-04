package com.sunbeam;

public class Main {

	public static void main(String[] args) {
			Deque que = new Deque(5);
			
			que.push_front(10);
			que.push_back(20);
			que.push_front(30);
			que.push_back(40);
			que.push_back(50);
			
			que.display();
			System.out.println();
			
			System.out.println("Front Element of the Deque : " + que.front());
			
			que.pop_front();
			
			System.out.println("Front Element of the Deque : " + que.front());
			
			que.pop_back();
			
			System.out.println("Front Element of the Deque : " + que.front());
			
			que.display();
			System.out.println();
			
			System.out.println("Back Element of the Deque : " + que.back());
			
			
	}

}
