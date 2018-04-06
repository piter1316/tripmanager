package pl.edu.agh.mwo;

public class testowa {

	
//	static String a = "Karaiby na 100";
//	
//	
//	public static String answer(String k) {
//		
//		if( a.contains(k))
//			return "TAK";
//		
//		return"NIE";
//	
//		
//	}
	

	 
	
	
	
	public static void main(String[] args) {
//		System.out.println(answer("na"));
		
		Trip tr1 = new Trip("w1","Karaiby na 100");
		Trip tr2 = new Trip("w2","malediwy na 100");
		TripManager.addTrip(tr1);
		TripManager.addTrip(tr2);
		System.out.println(TripManager.getTrips());
		
		System.out.println(TripManager.getTrips().size());
	
//		System.out.println(TripManager.findTrip());
		
		
		
	}

}


