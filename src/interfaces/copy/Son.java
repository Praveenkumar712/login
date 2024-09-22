package interfaces.copy;

public class Son implements Phone {

	@Override
	public void Ringtone() {
		System.out.println("Unstoppable");
	}
public static void main(String[] args) {
	Son Son = new Son();
	Son.Ringtone();
}
	
}
