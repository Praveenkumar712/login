package constuctor;

public class calling {
	
	public calling() {
		 System.out.println("hello ..");
	}
    public calling(int a, int b) {
    	this();
    	System.out.println(a+b);
    }
    public calling(double b,int c) {
    	
    	this(25, 20);
    
       System.out.println(b+c);
    
    }
    public static void main(String[] args) {
    	calling calling = new calling(22.0, 52);
	}
}
