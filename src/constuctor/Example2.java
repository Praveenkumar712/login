package constuctor;

public class Example2 {
	// default and parameterized
 public Example2() {
	 System.out.println("hello ..");
	 
 }
 public Example2(int a,int b){
	 System.out.println((a+b));
	 System.out.println((a-b));
	 System.out.println((a*b));
	 System.out.println((a/b));
	 
	 
 }
 public static void main(String[] args) {
	Example2 example2 = new Example2();
	Example2 example3 =new Example2(5,6);
}
}
