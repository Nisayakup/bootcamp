package Bootcamp_Questions_easy_medium;

public class given_string_is_a_palindrome_or_not {
	
	
	public static void main(String[] args) {
		
		
		String word = "MOM";
		String word2 = "";
		boolean isPali = false;
		
		for( int i = word.length()-1; i>=0; i--) {
			word2 = word2 + word.charAt(i);
		}
			System.out.println(word2);
			
			if(word.equals(word2)) {
				isPali = true; 
			}
		System.out.println(isPali);
	}
	      	
	}
    
 
    
    

