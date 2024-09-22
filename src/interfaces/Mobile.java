package interfaces;

public class Mobile implements Facebook,Instagram {

	@Override
	public void Message() {
		System.out.println("Message from someone");
		
	}

	@Override
	public void Notification() {
		System.out.println("Friend Request");
	}

	 public static void main(String[] args) {
		Mobile Mobile = new Mobile();
		Mobile.Message();
		Mobile.Notification();
	}
}
