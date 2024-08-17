package Bootcamp_part2;

public class part2_MixedArray {

    public static void main(String[] args) {
        // Create an array of Object to hold different types of values
        Object[] mixedArray = new Object[5];
        
        // Assign different types of values to the array
        mixedArray[0] = 42; // Integer
        mixedArray[1] = 'A'; // Character
        mixedArray[2] = "Hello, World!"; // String
        mixedArray[3] = 3.14; // Double
        mixedArray[4] = true; // Boolean

        // Print all elements of the array
        for (Object obj : mixedArray) {
            System.out.println(obj);
        }
    }
}


