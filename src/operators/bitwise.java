package operators;

     public class bitwise {
   
    public static void method1(int a, int b) {
  if (a>=b & b<=a) {
   System.out.println("True");	
} else {
	System.out.println("False");

}	
}
    public static void method2() {
    	if (4>=5 & 72 <=55) {
    		System.out.println("True");
			
		} else {
			System.out.println("False");
			

		}
		
	}
    public void method3(int i, int j) {
    	if (i<=j & j>=i) {
    		System.out.println("yes");
			
		} else {
         System.out.println("No");
		}	
	}
    public static void main(String[] args) {
		method1(10, 20);
		method2();
		bitwise bitwise = new bitwise();
		bitwise.method3(22,33);
	}
}
