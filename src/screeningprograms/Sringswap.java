package screeningprograms;

public class Sringswap {
	public static void main(String[] args) {
		// Initial strings
		String x = "john";
		String y = "sons";

		System.out.println("Before swapping:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);

		// Swap the strings
		String temp = x;
		x = y;
		y = temp;

		System.out.println("After swapping:");
		System.out.println("x = " + x);
		System.out.println("y = " + y);
	}
}


