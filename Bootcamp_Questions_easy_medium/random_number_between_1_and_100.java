package Bootcamp_Questions_easy_medium;

import java.util.Random;

public class random_number_between_1_and_100 {

	public static void main(String[] args) {
		
		Random random = new Random();
		
        int randomNumber = random.nextInt(100)+1;
        System.out.println(randomNumber);
	}

}
