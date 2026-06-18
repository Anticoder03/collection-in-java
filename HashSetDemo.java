package collectionDemo;

import java.util.HashSet;

public class HashSetDemo {
	public static void main(String[] args) {
		HashSet<String> names = new HashSet();
		
		names.add("Ashish");
		names.add("Raj");
		names.add("Sunny");
		names.add("Priya");
		names.add("Sunny");
		names.add("raj");
		
		System.out.println(names);
	}
}
