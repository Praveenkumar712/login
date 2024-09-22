package interfaces;

public class Sub implements Super {

	@Override
	public void goldforchain() {
		System.out.println("20 Grams");
		
	}
	public static void main(String[] args) {
		Sub Sub = new Sub();
		Sub.goldforchain();
	}
	

}
