package screeningprograms;

public class Palidroma {


	    public static void main(String[] args) {
	        String input = "madam";  // Input string
	        
	        // Check if the input string is a palindrome
	        if (isPalindrome(input)) {
	            System.out.println(input);  // Output the original string if it is a palindrome
	        } else {
	            System.out.println("The string is not a palindrome.");
	        }
	    }

	    // Method to check if a string is a palindrome
	    public static boolean isPalindrome(String str) {
	        // Remove spaces and convert to lowercase for a case-insensitive comparison
	        String cleanedStr = str.replaceAll("\\s+", "").toLowerCase();
	        
	        // Reverse the cleaned string
	        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
	        
	        // Check if the cleaned string is equal to its reversed version
	        return cleanedStr.equals(reversedStr);
	    }
	}

