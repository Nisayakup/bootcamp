package Bootcamp_Questions_easy_medium;

public class BinarySearch {
	
	 public static int binarySearch(int[] arr, int target) {
	        int left = 0;
	        int right = arr.length - 1;

	        while (left <= right) {
	            int middle = left + (right - left) / 2;

	            if (arr[middle] == target) {  return middle;     }

	             if (arr[middle] < target) {   left = middle + 1;   } 
	              else {        right = middle - 1;      }
	        }
	           return -1;
	    }

	    public static void main(String[] args) {
	        int[] arr = {2, 3, 4, 10, 40};
	        int target = 10;

	        int result = binarySearch(arr, target);

	        if (result == -1) {
	            System.out.println("Element not present in the array");
	        } else {
	            System.out.println("Element found at index " + result);
	        }
	    }
	}



