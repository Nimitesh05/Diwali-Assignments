package com.demo.test;

import com.demo.QuickSort.QuickSort;

public class Test_QuickSort {

	public static void main(String[] args) {
		QuickSort sort = new QuickSort();
		 String[] words = {"Banana", "apple", "Cherry", "mango", "Apricot"};

	        System.out.println("Before sorting:");
	        sort.display(words);

	        sort.quickSort(words, 0, words.length - 1);

	        System.out.println("After sorting:");
	        sort.display(words);

	}

}
