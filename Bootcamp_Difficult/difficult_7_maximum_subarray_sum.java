package Bootcamp_Difficult;

public class difficult_7_maximum_subarray_sum {
	
	
	public class MaxSubarraySum {

	    // Method to find the maximum subarray sum
	    public static int findMaxSubarraySum(int[] array) {
	        if (array == null || array.length == 0) {
	            throw new IllegalArgumentException("Array is empty or null.");
	        }

	        int currentMax = array[0];
	        int globalMax = array[0];

	        for (int i = 1; i < array.length; i++) {
	            currentMax = Math.max(array[i], currentMax + array[i]);
	            globalMax = Math.max(globalMax, currentMax);
	        }

	        return globalMax;
	    }

	    // Main method to test the implementation
	    public static void main(String[] args) {
	        int[] array = { -2, 1, -3, 4, -1, 2, 1, -5, 4 };

	        int maxSum = findMaxSubarraySum(array);
	        System.out.println("Maximum Subarray Sum: " + maxSum);
	    }
	}


}
