package strings;

public class Example2 {
public static void main(String[] args) {
		
		String string="Hello am from Bhuvanagiri";
		System.out.println(string.charAt(6));
		System.out.println(string.length());
		System.out.println(string.substring(3));
		System.out.println(string.substring(4, 15));
		System.out.println(string.contains("z"));
		System.out.println(string.equals("Hello am from Bhuvanagiri"));
		System.out.println(string.isEmpty());
		System.out.println(string.concat(" Telangana"));
		System.out.println(string.replace("o", "i"));
		System.out.println(string.equalsIgnoreCase("Hello am from bhuvanagiri"));
		System.out.println(string.trim());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.indexOf("o"));
		System.out.println(string.indexOf("h", 5));
	}
}
