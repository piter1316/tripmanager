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
	
	public static Trip getTrips() {
		
		return getTrips();
	}
	
	public void findTrip(String keyword) {
		
		if(Trip.name.contains(keyword) || Trip.description.contains(keyword)) {
			System.out.println("Trip found! "+ Trip.name);
		}
	}
	

}
