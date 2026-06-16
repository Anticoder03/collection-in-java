package collectionDemo;

import java.util.ArrayList;

public class Two_D_Demo {
	public static void main(String[] args) {
		ArrayList <String> MH = new ArrayList<>();
		ArrayList <String> GJ = new ArrayList<>();
		ArrayList <String> RJ = new ArrayList<>();
		ArrayList <ArrayList <String>> INDIA = new ArrayList<>();

		
		
		MH.add("Pune");
		MH.add("Mumbai");
		MH.add("Nagpur");
		System.out.println("City of HM: \n" + MH);
		
		RJ.add("Jaipur");
		RJ.add("Bikaner");
		RJ.add("Fatehpur");
		System.out.println("City of HM: \n" + RJ);
		
		GJ.add("Valsad");
		GJ.add("Gandhinagar");
		GJ.add("Kuchh");
		System.out.println("City of GJ: \n" + GJ);
		
		System.out.println("---------- Adding MH and GJ to Collection ----------");
		
	
		
		System.out.println("---------- add ----------");
		INDIA.add(MH);
		INDIA.add(GJ);
		INDIA.add(RJ);
		
//		System.out.println(INDIA.get(0).get(0));
		
		for (int i=0;i<INDIA.size();i++)
			System.out.println(INDIA.get(i).get(0));
		
		
	
		

		
	}
}
