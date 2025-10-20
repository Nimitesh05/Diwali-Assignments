package com.demo.test;

import com.demo.linklist.CircularLinkList;

public class TestLinkList {

	public static void main(String[] args) {
		
		CircularLinkList list = new CircularLinkList();
		list.addNode(10);
		list.addNode(20);
		list.addNode(30);
		list.addByPosition(25, 3);
		list.displayData();
		list.deleteNode(25);
		list.displayData();
		list.modifyNode();
		list.displayData();
	}

}
