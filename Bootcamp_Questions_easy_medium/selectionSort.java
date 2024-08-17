package Bootcamp_Questions_easy_medium;

import java.util.Arrays;

public class selectionSort {

	public static void main(String[] args) {
		
		
		int ar[]= {9,6,12,5,38,3};
		         //0,1,2,3,4,5
		
		int original;
		int j;
		
		
			for( int i=1;i<ar.length;i++) {
				
				original = ar[i]; //6
				
				j=i; //
				
				while(j>0 && ar[j-1]>original) {
					
					ar[j] = ar[j-1];
					
					j--; //0
					
					
					
				}
				
				ar[j] = original;
				
	
			
		}
		System.out.println(Arrays.toString(ar));
		
		
		
			}

}
