package com.demo.QuickSort;

public class QuickSort {

	    // Function to swap two elements
	    private static void swap(String[] arr, int i, int j) {
	        String temp = arr[i];
	        arr[i] = arr[j];
	        arr[j] = temp;
	    }

	    // Partition method
	    private static int partition(String[] arr, int low, int high) {
	        String pivot = arr[high]; // choose last element as pivot
	        int i = low - 1;

	        for (int j = low; j < high; j++) {
	            // compare strings lexicographically
	            if (arr[j].compareToIgnoreCase(pivot) <= 0) {
	                i++;
	                swap(arr, i, j);
	            }
	        }

	        swap(arr, i + 1, high);
	        return i + 1;
	    }

	    // Quick sort method
	    public static void quickSort(String[] arr, int low, int high) {
	        if (low < high) {
	            int pi = partition(arr, low, high);

	            quickSort(arr, low, pi - 1);  // sort left side
	            quickSort(arr, pi + 1, high); // sort right side
	        }
	    }

	    // Display method
	    public void display(String[] arr) 
	    {
	        for (String s : arr) 
	        {
	            System.out.print(s + " ");
	        }
	        System.out.println();
	    }

	    
	}


