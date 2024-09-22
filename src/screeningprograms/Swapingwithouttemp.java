package screeningprograms;

public class Swapingwithouttemp {
	public static void main(String[] args) {
		int a=20;
		int b=30;
		
		a=a+b; //50
		b=a-b; //10
		a=a-b; //
		
		System.out.println("value of a and b are"+ a +"  "+b);
	}

}
