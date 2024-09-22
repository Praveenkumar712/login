package abstraction;

public class Bank implements ATM {

	@Override
	public void Balanceenquiry() {
	       System.out.println("Display the balance in account ..........");
		
	}

	@Override
	public void Withdrawal() {
		System.out.println("Amount to be Dispensed ");
		
	}

	@Override
	public void Ministatement() {
		System.out.println("Mini Statemnt should be printed");
		
	}

	@Override
	public void Pinchange() {
		System.out.println("Pin change..........");
		
	}

	

}
