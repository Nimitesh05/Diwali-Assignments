package com.demo.test;

import com.demo.Queue.CircularQueue;

public class Test_circularQueue {

	public static void main(String[] args) {
		
		CircularQueue cq = new CircularQueue();

        cq.enqueue(10);
        cq.enqueue(20);
        cq.enqueue(30);
        cq.display();

        cq.dequeue();
        cq.display();

        cq.peek();

        cq.enqueue(40);
        cq.enqueue(50);
        cq.display();

        cq.dequeue();
        cq.dequeue();
        cq.display();
	}

}
