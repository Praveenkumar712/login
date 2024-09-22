package abstraction;

public class Atmcard {
	public ATM Insertcard() {
		ATM ATM = new Bank();
		return ATM;
	}
public static void main(String[] args) {
	Atmcard Atmcard = new Atmcard();
	ATM ATM = Atmcard.Insertcard();
	ATM.Balanceenquiry();
	ATM.Withdrawal();
	ATM.Ministatement();
	ATM.Pinchange();
}
}
