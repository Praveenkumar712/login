package constuctor;

public class Example3 {
	String name;
	long phone ;
	String email;
	String Address;
	
	public Example3 (String n, long p, String e,String a) {
		this.name=n;
		this.phone=p;
		this.email=e;
		this.Address=a;
		
		System.out.println("Name:"+this.name);
		System.out.println("phone:"+this.phone);
		System.out.println("email:"+this.email);
		System.out.println("Address:"+this.Address);
		System.out.println();
	}
	public static void main(String[] args) {
		Example3 example1 =new Example3("praveen", 234678461l, "praveen@" , "Bhongir");
		Example3 example2 =new Example3("venkat", 5568467444l, "venkat@" , "hyderabad");
		Example3 example3 =new Example3("sandeep", 448821141l, "sandeep@" , "uppal");
		Example3 example4 =new Example3("sai", 77884412326l, "sai@" , "gachibowli");
		
	}
	

}
