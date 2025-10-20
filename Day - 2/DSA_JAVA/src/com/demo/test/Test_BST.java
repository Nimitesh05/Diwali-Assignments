package com.demo.test;

import com.demo.BST.BinarySearchTree;

public class Test_BST {

	public static void main(String[] args) {
		
		        BinarySearchTree bst = new BinarySearchTree();

		        bst.addNode(50);
		        bst.addNode(30);
		        bst.addNode(70);
		        bst.addNode(20);
		        bst.addNode(40);
		        bst.addNode(60);
		        bst.addNode(80);

		        System.out.println("Original Tree:");
		        bst.inorder();
		        bst.preorder();
		        bst.postorder();

		        bst.removeNode(20);
		        bst.inorder();

		        bst.removeNode(30);
		        bst.inorder();

		        bst.removeNode(50);
		        bst.inorder();
		    }
		

	}


