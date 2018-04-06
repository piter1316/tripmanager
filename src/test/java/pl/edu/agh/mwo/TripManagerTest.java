package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.Test;

public class TripManagerTest {
	
	
	
	
	
	@Test
	public void addTripTest() {
		Trip tr1 = new Trip();
		assertEquals(0,TripManager.getTrips.size());
		TripManager.addTrip(tr1);
		assertEquals(1,TripManager.getTrips.size());
	}
	
//	@Test
//	public void removeTripTest() {
//		Trip tr1 = new Trip();
//		TripManager.addTrip(tr1);
//		TripManager.removeTrip(tr1);
//		assertEquals(0,TripManager.getTrips.size());
//	}
	
	

}
