package Bootcamp_part2;

public class part2_Access2DArray {

	
	public static void main(String[] args) {
        // Define the 2D array
        int[][] a = {
            {5, 2, 9},
            {4, 6, 8}
        };

        // Loop through each row
        for (int i = 0; i < a.length; i++) {
            // Loop through each column in the current row
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j] + " ");
            }
            // Print a newline character after each row
            System.out.println();
        }
    }
}


