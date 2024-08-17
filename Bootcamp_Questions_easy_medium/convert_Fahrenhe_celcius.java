package Bootcamp_Questions_easy_medium;

import java.util.Scanner;

public class convert_Fahrenhe_celcius {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);  
		
		System.out.println("Enter a number");
		
		Float temp = scan.nextFloat();
		Float temp1 = (temp - 32) * 5/9 ;
		System.out.println(temp1);
	}
	

}
