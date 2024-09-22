package interfaces;

public class Dad implements Phone{

	@Override
	public void Ringtone() {
		System.out.println("Devotional song");
		
	}
	public static void main(String[] args) {
		Dad Dad = new Dad();
		Dad.Ringtone();
	}

}


