package operators;

public class ternary {
	
		
	public void method1(int age) {

		String string= age>=18?"Eligible for vote": "Not Eligible for vote";
		System.out.println(string);
         
		int i=age!=10?20:30;
        System.out.println(i);

		}

		public static void method2() {

		String string = 10<20?"true": "false";

		System.out.println(string);

		}

		public static void main(String[] args) {

		ternary to=new ternary();

		to.method1(10);

		method2();

		

		}

		}

