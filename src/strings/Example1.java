package strings;

public class Example1 {
	public static void main(String[] args) {
		
		String string="My name is Praveenkumar";
		System.out.println(string.charAt(6));
		System.out.println(string.length());
		System.out.println(string.substring(3));
		System.out.println(string.substring(4, 15));
		System.out.println(string.contains("P"));
		System.out.println(string.equals("My name is Praveenkumar"));
		System.out.println(string.isEmpty());
		System.out.println(string.concat(" Pothamshetty"));
		System.out.println(string.replace("e", "i"));
		System.out.println(string.equalsIgnoreCase("hello from Hyderabad"));
		System.out.println(string.trim());
		System.out.println(string.toUpperCase());
		System.out.println(string.toLowerCase());
		System.out.println(string.indexOf("P"));
		System.out.println(string.indexOf("k", 5));
	}
}
