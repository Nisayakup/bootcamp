package Bootcamp_Questions_easy_medium;

public class WordCount {
    public static int countWords(String str) {

        str = str.trim();

        if (str.isEmpty()) {      return 0;     }

         String[] words = str.split("\\s+");
       
         return words.length;
    }

     public static void main(String[] args) {
        String str = "Hello, welcome to the world of Java programming!";

        int wordCount = countWords(str);
        System.out.println("Number of words in the string: " + wordCount);
    }
}



