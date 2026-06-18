package collectionDemo;
import java.util.ArrayList;
public class ArrayListOfCustomeClass {
	public static void main(String[] args) {
		ArrayList<Student> fy = new ArrayList();
		
		fy.add(new Student(1,21,"Ashish"));
		fy.add(new Student(2,22,"Raj"));
		fy.add(new Student(3,23,"Sunny"));
		
		System.out.println(fy);
		
		ArrayList<Student> sy = new ArrayList();
		
		sy.add(new Student(101,21,"Raja"));
		sy.add(new Student(102,22,"Riya"));
		sy.add(new Student(103,23,"Priya"));
		
		System.out.println(sy);
		
		
//		2D Array 
		ArrayList<ArrayList<Student>> bca = new ArrayList();
		bca.add(fy);
		bca.add(sy);
		
		System.out.println(bca);
		
		
		
		
	}
}
