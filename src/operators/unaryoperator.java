package operators;

public class unaryoperator {
	public void postprefix(int b) {
		System.out.println(b++);
		System.out.println(b);
		System.out.println(b--);
		
		
	}
	
		
	public static void prefix(int c) {
		System.out.println(++c);
		System.out.println(c);
		System.out.println(--c);
		
		
	}
	public static void main(String[] args) {
		unaryoperator unaryoperator = new unaryoperator();
		unaryoperator.postprefix(100);
		prefix(200);
		
	}

}
