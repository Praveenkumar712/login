package conrolstatement;

import java.util.Scanner;

public class switchscanner {
	
	public static void method1() {
		Scanner scanner = new Scanner (System.in);
		System.out.println("Enter the vehicle..........");
		 String vehicle = scanner.next();
		switch (vehicle) {
		case "car":System.out.println("pay 200/-");
			break;
		case "truck":System.out.println("pay 300/-");
		   break;
		default:System.out.println("no vehicle entered");
		
		}
		
	}
public static void main(String[] args) {
	method1();
}
}
