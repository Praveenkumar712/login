package methodoverloading;

public class Example1 {
	
		String name;
		int age;
		                       //constructor overloading
		
		public Example1(String name, int age) { // two arguments
			this.name=name;
			this.age=age;       
			
			System.out.println("name:"+this.name);
			System.out.println("age :"+this.age);
			System.out.println();
		}
	public  Example1(String name) {
		this.name=name;
		
		System.out.println("name:"+this.name);
		System.out.println();
		
	}
	
	// method over loading
	
	public static void Example1(String name) {
		System.out.println("praveen...........");
		System.out.println();
		
		
	}
	public static void Example2(String name) {
     System.out.println("chinu...............");	
     System.out.println();
	}
	public static void main(String[] args) {
		Example1 example1=new Example1("praveen",29);
		Example1 example2=new Example1("kiran");
		Example1("praveen");
	    Example2("chinu");
	}


}
