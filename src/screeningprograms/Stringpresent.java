package screeningprograms;

public class Stringpresent {

	public static void main(String[] args) {
		// Define the array of strings
		String[] array = {"welcome", "to", "session"};

		// Define the string to check for presence
		String target = "java";

		// Check if the target string is present in the array
		if (isStringPresent(array, target)) {
			System.out.println("The string \"" + target + "\" is present in the array.");
		} else {
			System.out.println("The string \"" + target + "\" is not present in the array.");
		}
	}

	// Method to check if a string is present in an array
	public static boolean isStringPresent(String[] array, String target) {
		for (String element : array) {
			if (element.equals(target)) {
				return true;
			}
		}
		return false;
	}
}


