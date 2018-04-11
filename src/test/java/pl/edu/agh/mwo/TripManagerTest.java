package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {

	private Trip tr1;
	private Trip tr2;

	@Before
	public void setUp() {
	Trip tr1 = new Trip();
	Trip tr2 = new Trip();
	} 
	@Test  
	public void addTripTest() {
		
		assertEquals(0, TripManager.getTrips.size());
		TripManager.addTrip(tr1);
		assertEquals(1, TripManager.getTrips.size());

	}

	@Test
	public void removeTripTest() {
		TripManager.removeTrip(tr1);
		
		assertEquals(1, TripManager.getTrips.size());
		TripManager.removeTrip(tr2);
		assertEquals(0, TripManager.getTrips.size());
	}

	@Test
	public void findTripTest() {
		
		TripManager.addTrip(tr1);
		tr1.setName("Wycieczka_1");
		tr1.setDescription("Karaiby na 100");

		assertEquals("Trip found! " + "Wycieczka_1", TripManager.findTrip("na"));
		assertEquals("Nie znaleziono", TripManager.findTrip("Malediwy"));

	}

	@Test
	public void getTripsTest() {
		
		TripManager.addTrip(tr1);
		assertEquals(1, TripManager.getTrips().size());
		TripManager.addTrip(tr2);
		assertEquals(2, TripManager.getTrips().size());

	}

}