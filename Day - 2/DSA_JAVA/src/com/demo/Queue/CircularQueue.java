package com.demo.Queue;

public class CircularQueue {

	    class Node {
	        int data;
	        Node next;

	        public Node(int data) {
	            this.data = data;
	            this.next = null;
	        }
	    }

	    private Node front = null;
	    private Node rear = null;


	    public void enqueue(int data) {
	        Node newNode = new Node(data);

	        if (front == null) {
	            // first node
	            front = newNode;
	            rear = newNode;
	            rear.next = front; // circular link
	        } else {
	            rear.next = newNode;
	            rear = newNode;
	            rear.next = front; // maintain circular link
	        }
	        System.out.println(data + " inserted into the queue.");
	    }

	    
	    
	    public void dequeue() {
	        if (front == null) {
	            System.out.println("Queue is empty, cannot dequeue.");
	            return;
	        }

	        int value = front.data;

	        if (front == rear) {
	            front = null;
	            rear = null;
	        } else {
	            front = front.next;
	            rear.next = front; 
	        }

	        System.out.println("Deleted: " + value);
	    }


	    public void peek() {
	        if (front == null) {
	            System.out.println("Queue is empty.");
	        } else {
	            System.out.println("Front element: " + front.data);
	        }
	    }


	    public void display() {
	        if (front == null) {
	            System.out.println("Queue is empty.");
	            return;
	        }

	        Node temp = front;
	        System.out.print("Queue elements: ");
	        do {
	            System.out.print(temp.data + " ");
	            temp = temp.next;
	        } while (temp != front);
	        System.out.println();
	    }


	    public boolean isEmpty() {
	        return front == null;
	    }

	}


