package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

	public static Collection<Trip> getTrips = new ArrayList<Trip>();

	public static void addTrip(Trip trip) {
		getTrips.add(trip);
	}
  
	public static void removeTrip(Trip trip) {
		getTrips.remove(trip);
	}
 
	public static Collection<Trip> getTrips() {

		return getTrips;

	}

	public static String findTrip(String keyword) {
		
		
		if (Trip.getDescription().contains(keyword)) 
			return "Trip found! " + Trip.getName(); 
		else
			return "Nie znaleziono";

	}

}
