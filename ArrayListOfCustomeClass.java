package collectionDemo;
import java.util.ArrayList;
public class ArrayListOfCustomeClass {
	public static void main(String[] args) {
		ArrayList<Student> fy = new ArrayList();
		
		fy.add(new Student(1,21,"Ashish"));
		fy.add(new Student(2,22,"Raj"));
		fy.add(new Student(3,23,"Sunny"));
		
		System.out.println(fy.get(0).toString());
		System.out.println(fy);
		
		
	}
}
