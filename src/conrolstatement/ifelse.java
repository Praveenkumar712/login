package conrolstatement;

public class ifelse {
	public static void method1(int age) {
		if (age>=18) {
			System.out.println("Elligible to vote ");
			
		} else {
			System.out.println("Not elligible to vote");

		}
		
	}
	public static void main(String[] args) {
		method1(23);
	}

}
