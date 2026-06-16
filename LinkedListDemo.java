package collectionDemo;

import java.util.Vector;

public class LinkedListDemo {
	public static void main(String[] args) {
		Vector<Integer> v=new Vector<>(2);
		v.add(1);v.add(2);v.add(3);
		System.out.print(v.capacity());
	}
}
