package variables;

public class nonstaticmethod {
	public void city() {
		System.out.println("banglore");
	}
   public static  void main(String[] args) {
   nonstaticmethod city = new nonstaticmethod ();
	city.city();
}
}
