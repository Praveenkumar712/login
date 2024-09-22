package interfaces.copy;

public class Employee extends Teamlead {

	@Override
	public void Testing() {
		System.out.println("Done with Testing ");
		
	}
	
public static void main(String[] args) {
	Employee Employee = new Employee();
	Employee.Testing();
}
}
