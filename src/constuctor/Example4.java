package constuctor;

public class Example4 {
   String name;
   int age;
   double tenth;
   double inter ;
   double degree;
   double pg;
    public Example4(String name, int Age,double tenth,double inter,double degree, double pg) {
    	this.name=name;
    	this.age=age;
    	this.tenth=tenth;
    	this.inter=inter;
    	this.degree=degree;
    	this.pg=pg;
    	
    	
    	System.out.println("name :"+this.name);
    	System.out.println("age :"+this.age);
    	System.out.println("tenth :"+this.tenth);
    	System.out.println("inter :"+this.inter);
    	System.out.println("degree :"+this.degree);
    	System.out.println("pg :"+this.pg);
    	System.out.println();
    }
    public Example4(String name, int Age,double tenth,double inter,double degree) {
    	this.name=name;
    	this.age=age;
    	this.tenth=tenth;
    	this.inter=inter;
    	this.degree=degree;
    	
    	System.out.println("name :"+this.name);
    	System.out.println("age :"+this.age);
    	System.out.println("tenth :"+this.tenth);
    	System.out.println("inter :"+this.inter);
    	System.out.println("degree :"+this.degree);
    	System.err.println();
    	
    }
    public Example4(String name, int Age,double tenth,double inter) {
    	
    	this.name=name;
    	this.age=age;
    	this.tenth=tenth;
    	this.inter=inter;
    	
    	System.out.println("name :"+this.name);
    	System.out.println("age :"+this.age);
    	System.out.println("tenth :"+this.tenth);
    	System.out.println("inter :"+this.inter);
    	System.out.println();
    	
    }
     
    public Example4(String name, int Age,double tenth) {
    
    	this.name=name;
    	this.age=age;
    	this.tenth=tenth;
    
    	System.out.println("name :"+this.name);
    	System.out.println("age :"+this.age);
    	System.out.println("tenth :"+this.tenth);
    	System.out.println();
    }
    public static void main(String[] args) {
		Example4 example1= new Example4("praveen", 24, 77.7, 68.8, 70.0, 82.0);
		Example4 example2=new Example4("venkat", 26, 80.0, 75.5, 45.0);
		Example4 example3 =new Example4("sai", 28, 85.0,90.0);
		Example4 example4=new Example4("kiran", 30, 90.0);
	}
}
