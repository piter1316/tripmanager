package pl.edu.agh.mwo;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class testowa {

	public static void main(String[] args) {
		
		Trip tr1 = new Trip();
		Trip tr2 = new Trip();
		TripManager.addTrip(tr1);
		tr1.setDescription("ama");
		TripManager.addTrip(tr2);
		tr2.setDescription("ba");
		
//		ArrayList<String> desc = new ArrayList();
//		desc.add(tr1.getDescription());
//		desc.add(tr2.getDescription());
//		
//		System.out.println(desc);
		
		
		
		System.out.println(tr1.getDescription());
		System.out.println(tr2.getDescription());
		
		
		
		
		
		
	
		
	}		
}