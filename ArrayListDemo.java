package collectionDemo;
import java.util.ArrayList;
public class ArrayListDemo {
	public static void main(String[] args) {
		ArrayList <String> names = new ArrayList();
		names.add("Ashish");
		names.add("Raj");
		names.add("Raja");
		
		System.out.println(names);
		
		//Add at specific index overloaded add(index,value);
		
		names.add(1,"Riya");
		
		System.out.println(names);
		
//		Get the values.
		System.out.println("First Value in names is: " + names.get(0));
		System.out.println("Secons Value in names is: " + names.get(1));
		
		
		
		
	}
}
