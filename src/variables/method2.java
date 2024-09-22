package variables;

public class method2 {
	public void demo1(int a,String atr) {
		System.out.println(a);
		System.out.println(atr);
	}
	public static void demo2(long l,double d, boolean b) {
	System.out.println(l);
	System.out.println(d);
	System.out.println(b);
		
	}
	public static void main(String[] args) {
		method2 method2 = new method2();
		method2.demo1(500, "praveen");
		demo2(22411541l,55.33,true);
		
	}
	

}
