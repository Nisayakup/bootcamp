package Bootcamp_part2;

public class part2_DivisibleByFive {
	
	public static void main(String[] args) {
        // Loop from 1 to 100
        for (int i = 1; i <= 100; i++) {
            // Check if the number is divisible by 5
            if (i % 5 == 0) {
                System.out.println(i + " Divisible by 5");
            } else {
                System.out.println(i);
            }
        }
    }
}


