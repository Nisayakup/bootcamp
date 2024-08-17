package Bootcamp_Questions_easy_medium;

public class factorialNumber {

	public static void main(String[] args) {
		
		
		int num = 7; 
		//7!=  = 7*6*5*4*3*2*1 = 
		
		long factorial=1; 
		
		for(int i=1;i<=num;i++) {
			factorial=factorial * i; // 7 42 210 840 2520 5040 5040
			}
		System.out.println("Factorial of a number is: " + factorial);
		
		
		
		}
		

	}


