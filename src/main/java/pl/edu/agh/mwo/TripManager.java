package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class TripManager {

	public Collection<Trip> getTrips = new ArrayList<Trip>();
	
	public void addTrip(Trip trip) {
		getTrips.add(trip);
	}
	
	public void removeTrip(Trip trip) {
		getTrips.remove(trip);
	}
	
	public Trip getTrips() {
		
		return getTrips();
	}
	
	public void findTrip(String keyword) {
		
		if(Trip.name.contains(keyword) || Trip.description.contains(keyword)) {
			System.out.println("Trip found! "+ Trip.name);
		}
	}
	

}
