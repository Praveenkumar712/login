package collections;

import java.util.ArrayList;

public class ArraysList {
	public void method1() {
		
		ArrayList<String> arrayList=new ArrayList<>();
		arrayList.add("kiran");
		arrayList.add("kethan");
		arrayList.add("akshith");
		arrayList.add("tillu");
		arrayList.add("suresh");
		arrayList.add("ramesh");
		arrayList.add("dinesh");
		
		
		System.out.println(arrayList);
		arrayList.add(2, "ravi");
		System.out.println(arrayList);
    // 	arrayList.clear();
	//	System.out.println(arrayList);
		System.out.println(arrayList.get(5));
		System.out.println(arrayList.lastIndexOf("tillu"));
		System.out.println(arrayList.isEmpty());
		System.out.println(arrayList.clone());
		arrayList.remove(4);
		System.out.println(arrayList);
		arrayList.remove("akshith");
		System.out.println(arrayList);
		arrayList.set(5, "praveen");
		System.out.println(arrayList);
		System.out.println(arrayList.size());
		arrayList.trimToSize();
		System.out.println(arrayList);
		
		
		for (String string : arrayList) {
			System.out.println(string);
		}
	}
	public static void main(String[] args) {
		ArraysList arraysList = new ArraysList();
		arraysList.method1();
	}

}
