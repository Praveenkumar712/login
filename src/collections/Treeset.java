package collections;

import java.util.TreeSet;

public class Treeset {
	
	
		public static void method1() {
			TreeSet<Integer> treeset=new TreeSet<>();
			treeset.add(5);
			treeset.add(3);
			treeset.add(4);
			treeset.add(1);
			treeset.add(2);
			treeset.add(100);
			
			System.out.println(treeset);
			System.out.println(treeset.ceiling(2));
			System.out.println(treeset.floor(5));
			System.out.println(treeset.higher(3));
			System.out.println(treeset.lower(2));
			System.out.println(treeset.clone());
		//	treeset.clear();
		//	System.out.println(treeset);
			System.out.println(treeset.pollFirst());
			System.out.println(treeset.pollLast());
			System.out.println(treeset.contains(7));
		//	treeset.remove(1);
		//	System.out.println(treeset);
			System.out.println(treeset.first());
			System.out.println(treeset.last());
			System.out.println(treeset.size());
			System.out.println(treeset.subSet(1, 4));
			System.out.println(treeset.tailSet(1));
			
			
		}
		public static void main(String[] args) {
			method1();
		}

	

}
