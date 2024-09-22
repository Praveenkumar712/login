package screeningprograms;

import java.util.Scanner;

public class Reversenumber {


	
	    public static void main(String[] args) {
	        Scanner scanner = new Scanner(System.in);

	        // Prompt user for input
	        System.out.print("Enter a 3-digit number: ");
	        int number = scanner.nextInt();

	        // Check if the number is a 3-digit number
	        if (number >= 100 && number <= 999) {
	            // Reverse the number
	            int reversedNumber = reverseNumber(number);

	            // Print the reversed number
	            System.out.println("Reversed number: " + reversedNumber);
	        } else {
	            System.out.println("Input is not a 3-digit number");
	        }

	        scanner.close();
	    }

	    // Method to reverse the digits of a 3-digit number
	    public static int reverseNumber(int num) {
	        int hundreds = num / 100;
	        int tens = (num % 100) / 10;
	        int units = num % 10;

	        return units * 100 + tens * 10 + hundreds;
	    }
	}



