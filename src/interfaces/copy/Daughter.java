package interfaces.copy;

public class Daughter implements Phone {

	@Override
	public void Ringtone() {
		System.out.println("On my way");
		
	}
public static void main(String[] args) {
	Daughter Daughter = new Daughter();
	Daughter.Ringtone();
}
}
