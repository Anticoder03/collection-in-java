package collectionDemo;
import java.util.ArrayList;
public class BasicMethodsOfCollection {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList<>();
//		Adding elements.
		names.add("Ashish");
		names.add("Raj");
		System.out.println(names);
//		Adding at specific position.
		names.add(1,"sunny");
		names.add(0,"Riya");
		
		System.out.println(names);
		
//		Get elements.
		System.out.println(names.get(0));
		System.out.println(names.get(1));
		System.out.println(names.get(2));
		
//		Remove elements (by index).
		names.remove(2);
		System.out.println(names);
//		Remove elements (by value).
		names.remove("Ashish");
		System.out.println(names);
		
//		Check if the collection is empty or not.
		System.out.println(names.isEmpty());
		
//		Check if the collection contain the element or not.
		System.out.println(names.contains("Riya"));
		
//		Checking the size of collection.
		System.out.println("Size of names is: " + names.size());
		
//		Clear the collection.
		names.clear();
		System.out.println(names);
		
		System.out.println("Name isEmpty :" + names.isEmpty());
		System.out.println("Name contain(Ashish) :" + names.contains("Ashish"));
		
		
		
		
	}
}
