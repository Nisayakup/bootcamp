package Bootcamp_Difficult;

public class difficult_6_longest_common_subsequence {
	
	
	//Step 1 : Define the LCS (Longest Common Subsequence)

	public class LCS {

	    public static int findLCSLength(String str1, String str2) {
	        int m = str1.length();
	        int n = str2.length();
	        
	        // Create a 2D array to store lengths of longest common subsequence.
	        int[][] dp = new int[m + 1][n + 1];
	        
	        // Build the dp array from bottom up
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        
	        // dp[m][n] contains the length of LCS for str1 and str2
	        return dp[m][n];
	    }

	    // Method to find the longest common subsequence itself
	    public static String findLCS(String str1, String str2) {
	        int m = str1.length();
	        int n = str2.length();
	        int[][] dp = new int[m + 1][n + 1];
	        
	        // Build the dp array
	        for (int i = 1; i <= m; i++) {
	            for (int j = 1; j <= n; j++) {
	                if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
	                    dp[i][j] = dp[i - 1][j - 1] + 1;
	                } else {
	                    dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]);
	                }
	            }
	        }
	        
	        // Recover the longest common subsequence from the dp array
	        StringBuilder lcs = new StringBuilder();
	        int i = m, j = n;
	        while (i > 0 && j > 0) {
	            if (str1.charAt(i - 1) == str2.charAt(j - 1)) {
	                lcs.append(str1.charAt(i - 1));
	                i--;
	                j--;
	            } else if (dp[i - 1][j] > dp[i][j - 1]) {
	                i--;
	            } else {
	                j--;
	            }
	        }        
	        return lcs.reverse().toString(); // Reverse the string as we built it backwards
	    }

	    // Main method to test the LCS implementation
	    public static void main(String[] args) {
	        String str1 = "ABCBDAB";
	        String str2 = "BDCAB";
	        
	        // Find and print the length of the longest common subsequence
	        int length = findLCSLength(str1, str2);
	        System.out.println("Length of LCS: " + length);
	        
	        // Find and print the longest common subsequence
	        String lcs = findLCS(str1, str2);
	        System.out.println("Longest Common Subsequence: " + lcs);
	    }
	}

}