package screeningprograms;

public class Primenumbers {
	
	    public static void main(String[] args) {
	        int number = 30;  // Input number

	        if (isPrime(number)) {
	            System.out.println(number + " is a prime number.");
	        } else {
	            System.out.println(number + " is not a prime number.");
	        }
	    }

	    // Method to check if a number is prime
	    public static boolean isPrime(int num) {
	        // Handle special cases
	        if (num <= 1) {
	            return false;
	        }
	        if (num == 2) {
	            return true;  // 2 is the only even prime number
	        }
	        if (num % 2 == 0) {
	            return false; // Other even numbers are not prime
	        }

	        // Check for factors from 3 up to the square root of num
	        for (int i = 3; i <= Math.sqrt(num); i += 2) {
	            if (num % i == 0) {
	                return false;
	            }
	        }

	        return true;
	    }
	}


