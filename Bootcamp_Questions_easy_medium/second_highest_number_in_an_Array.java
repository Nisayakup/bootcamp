package Bootcamp_Questions_easy_medium;

public class second_highest_number_in_an_Array {
	
	
	public class Main {
		  public static void main(String[] args) {
			  
			  
		    int[] numbers = { 5, 3, 9, 1, 6, 7, 4 };
		                    //0, 1, 2, 3, 4, 5, 6
		                      
		    int high = numbers[0];
		    int secondhigh = numbers[0];


		    /*
		    high = 5
		    secobdHigh = 5

		    Loop 1:
		    i = 1
		    3 > 5?
		    3 > 5? 3!=5

		    Loop2:
		    i = 2
		    9 > 5?
		    second = 5
		    high = 9

		    Loop3:
		    i = 3
		    1 > 9
		    1 > 5?

		    Loop4
		    i = 4
		    6 > 9?
		    6 > 5? 6 not equal 9
		    secondHigh = 6

		    Loop5
		    i = 5
		    7 > 9?
		    7 > 6? 7 not equal 9
		    secondHigh = 7
		    */
		    for (int i = 1; i < numbers.length; i++){
		      if (numbers[i] > high){
		        secondhigh = high;
		        high = numbers[i];
		      
		      } else if (numbers[i] > secondhigh && numbers[i] != high) {
		            secondhigh = numbers[i];
		      }
		    }
		    
		    
		  }

		}
	
	

}
