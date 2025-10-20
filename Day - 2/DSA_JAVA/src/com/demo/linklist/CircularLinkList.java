package com.demo.linklist;

import java.util.Scanner;

public class CircularLinkList {

	Node head;
	class Node{
		int data;
		Node next;
		public Node(int value)
		{
			this.data = value;
			this.next = null;
		}
	}
	
	public void addNode(int value)
	{
		Node newNode = new Node(value);
		
		if(head == null)
		{
			head = newNode;
			newNode.next = head;
		}
		else {
			Node temp = head;
			while(temp.next!=head)
			{
				temp = temp.next;
			}
			temp.next = newNode;
			newNode.next = head;
		}
	}
	
	public void addByPosition(int value , int position)
	{
		if(head == null)
		{
			System.out.println("List is Empty...");
			return;
		}
		
			Node newNode = new Node(value);
			
			if(position == 1)
			{
				Node temp = head;
				while(temp.next!=head)
				{
					temp = temp.next;
				}
				newNode.next = head;
				head = newNode;
				temp.next = head;
			}
			else
			{
				Node temp = head;
				for(int i = 1; temp.next != head && i<position-1; i++)
				{
					temp = temp.next;
				}
				
				if(temp.next == head && position > 2)
				{
					System.out.println("Position is out of bounds...");
				}
				else
				{
					newNode.next = temp.next;
					temp.next = newNode;
				}
			}
		
	}
	
	public void displayData() 
	{
   	 if(head==null) {
   	 	 System.out.println("list is empty");
   	 }else {
   		 Node temp=head;
   		 do{
   			 System.out.print(temp.data+",");
   			 temp=temp.next;
   		 }while(temp!=head);
   		 System.out.println();
   	 }
    }
	
	public void deleteNode(int value) {
	    if (head == null) {
	        System.out.println("List is empty, nothing to delete.");
	        return;
	    }

	    Node current = head;
	    Node prev = null;

	    // Case 1: head node itself contains the value
	    if (head.data == value) {
	        // if only one node
	        if (head.next == head) {
	            head = null;
	            return;
	        }

	        // find the last node to maintain circular connection
	        Node temp = head;
	        while (temp.next != head) {
	            temp = temp.next;
	        }

	        temp.next = head.next; // last node points to new head
	        head = head.next;      // move head forward
	        return;
	    }

	    // Case 2: node to delete is not the head
	    prev = head;
	    current = head.next;
	    while (current != head) {
	        if (current.data == value) {
	            prev.next = current.next;
	            return;
	        }
	        prev = current;
	        current = current.next;
	    }

	    // Case 3: value not found
	    System.out.println("Node with value " + value + " not found.");
	}
	
	public void modifyNode() {
	    if (head == null) {
	        System.out.println("List is empty, nothing to modify.");
	        return;
	    }

	    Scanner sc = new Scanner(System.in);
	    System.out.print("Enter the data value of the node to modify: ");
	    int oldValue = sc.nextInt();

	    Node temp = head;
	    boolean found = false;

	    do {
	        if (temp.data == oldValue) {
	            System.out.print("Enter the new value: ");
	            int newValue = sc.nextInt();
	            temp.data = newValue;
	            found = true;
	            System.out.println("Node updated successfully!");
	            break;
	        }
	        temp = temp.next;
	    } while (temp != head);

	    if (!found) {
	        System.out.println("Node with value " + oldValue + " not found.");
	    }
	}


}
