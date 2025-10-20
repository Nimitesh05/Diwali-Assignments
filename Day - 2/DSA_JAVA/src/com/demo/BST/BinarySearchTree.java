package com.demo.BST;

public class BinarySearchTree {

	    // Node class
	    class Node 
	    {
	        int data;
	        Node left, right;

	        public Node(int value) 
	        {
	            data = value;
	            left = right = null;
	        }
	    }

	    private Node root;

	 
	    public void addNode(int value) 
	    {
	        root = insertRec(root, value);
	    }

	    private Node insertRec(Node root, int value) 
	    {
	        if (root == null) 
	        {
	            root = new Node(value);
	            return root;
	        }

	        if (value < root.data)
	            root.left = insertRec(root.left, value);
	        else if (value > root.data)
	            root.right = insertRec(root.right, value);

	        return root;
	    }


	    public void removeNode(int value) 
	    {
	        root = deleteRec(root, value);
	    }

	    private Node deleteRec(Node root, int value) {
	        if (root == null)
	            return root;

	        if (value < root.data)
	            root.left = deleteRec(root.left, value);
	        else if (value > root.data)
	            root.right = deleteRec(root.right, value);
	        else 
	        {
	            if (root.left == null && root.right == null)
	                return null; // no child
	            else if (root.left == null)
	                return root.right; // one child
	            else if (root.right == null)
	                return root.left;  // one child
	            // two children
	            root.data = minValue(root.right);
	            root.right = deleteRec(root.right, root.data);
	        }
	        return root;
	    }

	    private int minValue(Node root) {
	        int minv = root.data;
	        while (root.left != null) {
	            minv = root.left.data;
	            root = root.left;
	        }
	        return minv;
	    }

	    

	    // Inorder (Left, Root, Right)
	    public void inorder() {
	        System.out.print("Inorder: ");
	        inorderRec(root);
	        System.out.println();
	    }

	    private void inorderRec(Node root) {
	        if (root != null) {
	            inorderRec(root.left);
	            System.out.print(root.data + " ");
	            inorderRec(root.right);
	        }
	    }

	    // Preorder (Root, Left, Right)
	    public void preorder() {
	        System.out.print("Preorder: ");
	        preorderRec(root);
	        System.out.println();
	    }

	    private void preorderRec(Node root) {
	        if (root != null) {
	            System.out.print(root.data + " ");
	            preorderRec(root.left);
	            preorderRec(root.right);
	        }
	    }

	    // Postorder (Left, Right, Root)
	    public void postorder() {
	        System.out.print("Postorder: ");
	        postorderRec(root);
	        System.out.println();
	    }

	    private void postorderRec(Node root) {
	        if (root != null) {
	            postorderRec(root.left);
	            postorderRec(root.right);
	            System.out.print(root.data + " ");
	        }
	    }
	}


