package Bootcamp_Difficult;

public class difficult_8_merge_sort_algorithm {
	public class MergeSort {

	    // Method to sort an array using merge sort
	    public static void mergeSort(int[] array) {
	        if (array.length < 2) {
	            return; // Array is already sorted if it has less than 2 elements
	        }
	        int mid = array.length / 2;

	        // Split the array into two halves
	        int[] leftHalf = new int[mid];
	        int[] rightHalf = new int[array.length - mid];

	        System.arraycopy(array, 0, leftHalf, 0, mid);
	        System.arraycopy(array, mid, rightHalf, 0, array.length - mid);

	        // Recursively sort both halves
	        mergeSort(leftHalf);
	        mergeSort(rightHalf);

	        // Merge the sorted halves
	        merge(array, leftHalf, rightHalf);
	    }

	    // Method to merge two sorted subarrays into one sorted array
	    private static void merge(int[] array, int[] leftHalf, int[] rightHalf) {
	        int leftSize = leftHalf.length;
	        int rightSize = rightHalf.length;

	        int i = 0, j = 0, k = 0;

	        // Merge the two halves
	        while (i < leftSize && j < rightSize) {
	            if (leftHalf[i] <= rightHalf[j]) {
	                array[k++] = leftHalf[i++];
	            } else {
	                array[k++] = rightHalf[j++];
	            }
	        }

	        // Copy any remaining elements from leftHalf
	        while (i < leftSize) {
	            array[k++] = leftHalf[i++];
	        }

	        // Copy any remaining elements from rightHalf
	        while (j < rightSize) {
	            array[k++] = rightHalf[j++];
	        }
	    }

	    // Main method to test the merge sort implementation
	    public static void main(String[] args) {
	        int[] array = {38, 27, 43, 3, 9, 82, 10};

	        System.out.println("Array before sorting:");
	        printArray(array);

	        mergeSort(array);

	        System.out.println("Array after sorting:");
	        printArray(array);
	    }

	    // Helper method to print an array
	    private static void printArray(int[] array) {
	        for (int value : array) {
	            System.out.print(value + " ");
	        }
	        System.out.println();
	    }
	}


}
