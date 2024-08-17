package Bootcamp_Questions_easy_medium;

import java.util.Scanner;

public class Palindrome_Number {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a number: ");
		
		int num = scan.nextInt();
		
		int num2 = num;
		
		int rev = 0;
		while(num != 0) {
			rev = rev*10 + num%10;
			num = num /10;
		}
		//System.out.println(rev);
		
	
	if(num2 == rev) {
	
		System.out.println(num2+ " is Palindrome Number.");
	}else {
		System.out.println(num2+ " is not Palindrome Number.");
	}
	
} 
	}

