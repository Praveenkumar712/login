package encapsulation;

public class Admin {

	private String name;
	private long phno;
	private String email;
	private String password;
	private String address;
	// Getter setter methods using source
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhno() {
		return phno;
	}
	public void setPhno(long phno) {
		this.phno = phno;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public static void main(String[] args) {
		Admin Admin = new Admin();
		Admin.setName("praveen");
		Admin.setPhno(9982632472l);
		Admin.setEmail("praveen@gmail.com");
		Admin.setPassword("44155632");
		Admin.setAddress("mumbai");
		
		
		System.out.println(Admin.getName());
		System.out.println(Admin.getPhno());
		System.out.println(Admin.getEmail());
		System.out.println(Admin.getPassword());
		System.out.println(Admin.getAddress());
		System.out.println();
		
		Admin Admin2 =new Admin();
		Admin2.setName("saketh");
		Admin2.setPhno(992256422472l);
		Admin2.setEmail("saketh@gmail.com");
		Admin2.setPassword("hhdjjdjjd");
		Admin2.setAddress("delhi");
		
		System.out.println(Admin2.getName());
		System.out.println(Admin2.getPhno());
		System.out.println(Admin2.getEmail());
		System.out.println(Admin2.getPassword());
		System.out.println(Admin2.getAddress());
		
		
		
		
		
		
		
		
		
		
		
	}
}
