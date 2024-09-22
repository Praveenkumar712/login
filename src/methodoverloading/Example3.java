package methodoverloading;

public class Example3 {
	
	// method overloading  Travel 
		public static void Travel(String bus) {
			System.out.println("Travel by bus");
		}
		public static void Travel(long car) {
			System.out.println("Travel by car");
			
		}
		public void Travel( int bike) {
			System.out.println("Travel by bike");
		}
		
		// constructor overloading
		String bus;
		long car;
		String bike;
		 
		 public Example3(String bus,long car,String bike) {
			 this.bus=bus;
			 this.car=car;
			 this.bike=bike;
			 
			 
			 System.out.println("bus :" + this.bus);
			 System.out.println("car :" + this.car);
			 System.out.println("bike :" + this.bike);
		
			 System.out.println();
		 }
		 public Example3(String bus,long car) {
			 
			 this.bus=bus;
			 this.car=car;
			
			 
			 
			 System.out.println("bus :" + this.bus);
			 System.out.println("car :" + this.car);
			
			 System.out.println();
			 
			 
		 }
		 public static void main(String[] args) {
			 Example3 Example2 = new Example3("garuda", 14646461l, "Royalfield");
			 Example3 Example3 = new Example3("tsrtc", 04161114l);
			Travel("garuda");
			Travel(23265626l);
			Example3.Travel(20);
		
	}

}
