package Bootcamp_Questions_easy_medium;

import java.util.Scanner;

public class simple_calcular {

	public static void main(String[] args) {
		

		int num1 = 20;
		int num2 = 5;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 0 for+ , 1 for - , 2 for / , 3 for *");
		
		int op = scan.nextInt();
		
		if (op == 0) {
			System.out.println(num1+num2);			
		}
		else if(op == 1) {
			System.out.println(num1-num2);
		}
		else if(op == 2) {
			System.out.println(num1 / num2);
		}
		else if(op == 3) {
			System.out.println(num1 * num2);
		}
	}

}
