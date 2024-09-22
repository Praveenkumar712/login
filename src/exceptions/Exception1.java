package exceptions;

public class Exception1 {
	
	
	
	public void method1(int num) {
		try {
			int a=num/0;
			System.out.println(a);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
	}
	
	public static void main(String[] args) {
		Exception1 exception1=new Exception1();
		exception1.method1(10);
		
		
		
		System.out.println("Hello...!!!");
		System.out.println("how r u ...!!!");
		System.out.println("nname...!!!");
		System.out.println("Age...!!!");
		System.out.println("address...!!!");
	}
}
