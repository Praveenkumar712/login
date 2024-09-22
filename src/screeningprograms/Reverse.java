package screeningprograms;

public class Reverse {
	 public static void main(String[] args) {  
	      String originalString = "Hello World!";  
	      String reversedString = "";  
	      for (int i = originalString.length() - 1; i >= 0; i--) {  
	         reversedString += originalString.charAt(i);  
	      }  
	      System.out.println("Original String: " + originalString);  
	      System.out.println("Reversed String: " + reversedString);  
	   }  
}
