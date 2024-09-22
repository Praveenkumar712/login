package collections;

import java.util.LinkedList;

public class Linkedlist {

	public void method1() {
		LinkedList<Integer> linkedList = new LinkedList<>();
		linkedList.add(22);
		linkedList.add(33);
		linkedList.add(44);
		linkedList.add(55);
		linkedList.add(66);
		linkedList.add(77);
		linkedList.add(6, 88);
		System.out.println(linkedList);
		linkedList.addFirst(0);
		linkedList.addLast(99);
		System.out.println(linkedList);
		System.out.println(linkedList.contains(22));
		System.out.println(linkedList.element());
		System.out.println(linkedList.getFirst());
		System.out.println(linkedList.getLast());
		System.out.println(linkedList.indexOf(77));
		System.out.println(linkedList.offer(111));
		System.out.println(linkedList);
		System.out.println(linkedList.peek());
		System.out.println(linkedList.peekFirst());
		System.out.println(linkedList.peekLast());
		System.out.println(linkedList.poll());
		System.out.println(linkedList);
		System.out.println(linkedList.pollFirst());
		System.out.println(linkedList);
		System.out.println(linkedList.pollLast());
		System.out.println(linkedList);
		System.out.println(linkedList.pop());
		linkedList.push(121);
		System.out.println(linkedList);
		System.out.println(linkedList.size());
	}
	
	public static void main(String[] args) {
		Linkedlist Linkedlist = new Linkedlist();
		Linkedlist.method1();
	}
}
