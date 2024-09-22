package abstraction;

public class User {

	public static Mobile output() {
		Mobile Mobile  = new Mobile2();
		return Mobile;
	}

	public static void main(String[] args) {
		Mobile Mobile = output();
		Mobile.Makeacall();
		Mobile.Sendamessage();
		Mobile.Openinstagram();
	}
}
