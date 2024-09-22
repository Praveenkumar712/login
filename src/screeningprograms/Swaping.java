package screeningprograms;

public class Swaping {
	
	    public static void main(String[] args) {
	        int a = 10;
	        int b = 20;

	        System.out.println("Before swapping: a = " + a + ", b = " + b);

	        // Using a temporary variable to swap values
	        int temp = a;
	        a = b;
	        b = temp;

	        System.out.println("After swapping: a = " + a + ", b = " + b);
	    }
}
