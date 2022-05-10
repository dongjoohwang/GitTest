package com.ezen.ex01;

import java.util.LinkedList;
import java.util.Queue;

public class QueneEx {

	public static void main(String[] args) {
		
		Queue<String> que = new LinkedList<String>();	// string만 삽입
		
		que.offer("box");
		que.offer("toy");
		que.offer("tag");

		System.out.println(que);
		System.out.println(que.peek());
		
		System.out.println(que);
		System.out.println(que.poll());
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que);
		
		System.out.println(que.poll());
		System.out.println(que);
		System.out.println(que.peek());
	}

}







