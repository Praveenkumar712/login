package methodoverloading;

public class Example4 {
	String name;
	int age;
	long ID;
	double percentage;
	                      
	
	public Example4(String name,int age,long ID,double percentage) { 
		this.name=name;
		this.age=age; 
		this.ID=ID;
		this.percentage=percentage;
		
		System.out.println("name:"+this.name);
		System.out.println("age :"+this.age);
		System.out.println("ID :"+ this.ID);
		System.out.println("percentage :"+this.percentage);
		System.out.println();
	}
      public  Example4(String name,int age,long ID) {
    	this.name=name;
	    this.age=age; 
	    this.ID=ID;
	
    	System.out.println("name:"+this.name);
    	System.out.println("age :"+this.age);
	    System.out.println("ID :"+ this.ID);
	    System.out.println();
	
   }
     
      public  Example4(String name,int age) {
      	this.name=name;
  	    this.age=age; 
  	    
  	
      	System.out.println("name:"+this.name);
      	System.out.println("age :"+this.age);
  	    System.out.println();
  	
     }
      

// method over loading

       public static void Student(String name) {
	    System.out.println("praveen...........");
	    
	
   }
   public static int Student(int age) {
             return age;
             
  }
     public static long Student(long ID) {
	    return ID;
	    
   }
     public static double Student(double percentage) {
	   return percentage;
  }
   public static void main(String[] args) {
	Example4 example1=new Example4("praveen", 25, 18245456l, 85.20);
	Example4 example2=new Example4("sai", 26, 411264441l);
	Example4 example3=new Example4("saketh", 27);
	
	Student("praveen");
	System.out.println(Student(25));
    System.out.println(Student(44646643l));
    System.out.println(Student(90.50));
}


}
