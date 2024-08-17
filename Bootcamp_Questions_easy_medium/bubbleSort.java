package Bootcamp_Questions_easy_medium;

import java.util.Arrays;

public class bubbleSort {

	public static void main(String[] args) {
		
		
		int a[] = {10,5,2,1,4,6,3};
		System.out.println("Array before sorting:"+Arrays.toString(a));
		
		int n=a.length;
		
		for(int i=0; i<n-1;i++) {   //number of passes	
			//need to compared two values, create another loop
			
			 for(int j=0; j<n-1;j++) {  //iteration in each pass = 8
				 
				 if(a[j]>a[j+1]) {
					 
					 int temp = a[j];
					 a[j]=a[j+1];
					 a[j+1]=temp;
					 
					 
				 }
				 
			 }
			 
			
		}
		
		System.out.println("Array after sorting:"+Arrays.toString(a));
		
		
	}

}
