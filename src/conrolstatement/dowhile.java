package conrolstatement;

public class dowhile {
	public static void method1(boolean b) {
		do {
			System.out.println(b);
		} while (b);
		
	}
	public static void method2(int i,int j) {
		do {
			System.out.println(i+j);
			System.out.println(i-j);
		} while (i==j);
		
	}
	public static void main(String[] args) {
		method1(false);
		method2(20, 5);
	}

}
