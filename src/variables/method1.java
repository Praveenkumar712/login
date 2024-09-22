package variables;

public class method1 {
   public void demo1() {
	 System.out.println("Non static.......");
	 
   }
   public static void demo2() {
	   method1 method1 = new method1();
	   method1.demo1();
	   System.out.println("static...");
	
}
   public static void demo3() {
	   demo2();
	   System.out.println("non static'''''''''''");
	
}
   public static void main(String[] args) {
	   demo3();
	
	
}
}
