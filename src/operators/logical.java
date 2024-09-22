package operators;

public class logical {
 public static void method1(double a, double b) {
	 if (a<=b && a!=b) {
		System.out.println("True");
	} else {
System.out.println("False");
	}
	
}
 public void method2(int a, int b) {
	 if (a==b || a<=b) {
		 System.err.println("True");
		
	} else {
     System.out.println("False");
	}
	
}
 public static void main(String[] args) {
	method1(55.25, 44.50);
	logical logical = new logical();
	logical.method2(10, 20);
}
}
