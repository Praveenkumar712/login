package collections;

import java.util.HashSet;

public class Hashset {
	public static void method1() {
		
		HashSet<String>HashSet=new HashSet<>();
		HashSet.add("praveen");
		HashSet.add("saketh");
		HashSet.add("kiran");
		HashSet.add("jagdesh");
		HashSet.add("sandeep");
		HashSet.add("akshith");
		HashSet.add("nitin");
		System.out.println(HashSet);
		System.out.println(HashSet.size());
		System.out.println(HashSet.clone());
		//HashSet.clear();
		//System.out.println(HashSet);
		System.out.println(HashSet.isEmpty());
		System.out.println(HashSet.remove("sandeep"));
		System.out.println(HashSet);
		
		
	}
	public static void main(String[] args) {
		method1();
	}
	

}
