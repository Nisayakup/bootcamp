package Bootcamp_Difficult;


	public class RotatedBinarySearch {

	    public static int binarySearchInRotatedArray(int[] array, int target) {
	        int left = 0;
	        int right = array.length - 1;

	        while (left <= right) {
	            int mid = left + (right - left) / 2;

	            if (array[mid] == target) {
	                return mid; // Target found at index mid
	            }

	            // Determine which portion is sorted
	            if (array[left] <= array[mid]) {
	                // Left portion is sorted
	                if (array[left] <= target && target < array[mid]) {
	                    right = mid - 1; // Search in the left portion
	                } else {
	                    left = mid + 1; // Search in the right portion
	                }
	            } else {
	                // Right portion is sorted
	                if (array[mid] < target && target <= array[right]) {
	                    left = mid + 1; // Search in the right portion
	                } else {
	                    right = mid - 1; // Search in the left portion
	                }
	            }
	        }

	        return -1; // Target not found
	    }

	    // Main method to test the binary search in a rotated sorted array
	    public static void main(String[] args) {
	        int[] array = {15, 18, 2, 3, 6, 12};
	        int target = 3;

	        int result = binarySearchInRotatedArray(array, target);
	        if (result != -1) {
	            System.out.println("Target " + target + " found at index: " + result);
	        } else {
	            System.out.println("Target " + target + " not found in the array.");
	        }
	    }
	}



