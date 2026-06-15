package collectionDemo;
import java.util.ArrayList;
public class CollectionDemo {
	public static void main(String[] args) {
		ArrayList <String> MH = new ArrayList();
		ArrayList <String> GJ = new ArrayList();
		ArrayList <ArrayList <String>> INDIA = new ArrayList();
		ArrayList <String> BHARAT = new ArrayList();
		
		
		MH.add("Pune");
		MH.add("Mumbai");
		MH.add("Nagpur");
		System.out.println("City of HM: \n" + MH);
		
		GJ.add("Valsad");
		GJ.add("Gandhinagar");
		GJ.add("Kuchh");
		System.out.println("City of GJ: \n" + GJ);
		
		System.out.println("---------- Adding MH and GJ to Collection ----------");
		
		System.out.println("---------- addAll ----------");
		BHARAT.addAll(MH);
		BHARAT.addAll(GJ);
		
		System.out.println("Added MH and GJ (using addAll()): \n" + BHARAT);
		
		System.out.println("---------- add ----------");
		INDIA.add(MH);
		INDIA.add(GJ);
		
		System.out.println("Added MH and GJ (using add()): \n" + BHARAT);
		
//		remove()
//		INDIA.remove(GJ);
//		System.out.println(INDIA);
		
//		retain()
		INDIA.retainAll(GJ);
		System.out.println(INDIA);
		
		
		
	}
}
