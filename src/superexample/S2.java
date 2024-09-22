package superexample;



public class S2 extends S1 {

	public S2(String msg) {
		super(msg);
	}

	String Name="sandeep";
	String Surname = "abcd";
	
	public void display() {
		System.out.println(Name);
		System.out.println(Surname);
		System.out.println(super.Name);
		System.out.println(super.surname);
	}
	
	public void method1() {
		System.out.println("Hello From sub Class..!!");
	}
	
	public void method2() {
		super.Demo1();
	}
	
	public static void main(String[] args) {
	    S2 S2=new S2("Hello");
		S2.display();
		S2.method1();
		S2.method2();
	}

}
