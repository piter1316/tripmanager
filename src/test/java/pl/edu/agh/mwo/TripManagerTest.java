package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.util.Collection;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TripManagerTest {



	

	@Test
	public void addTripTest() {
		Trip tr1 = new Trip("Wycieczka_1", "Karaiby");
		assertEquals(0, TripManager.getTrips.size());
		TripManager.addTrip(tr1);
		assertEquals(1, TripManager.getTrips.size());

	}

	@Test
	public void removeTripTest() {
		Trip tr1 = new Trip("Wycieczka_1", "Karaiby");
		Trip tr2 = new Trip("Wycieczka_2", "KANARY");

		TripManager.addTrip(tr1);
		TripManager.addTrip(tr2);
		TripManager.removeTrip(tr1);
		assertEquals(1, TripManager.getTrips.size());

	}

	@Test
	public void findTripTest() {
		Trip tr1 = new Trip("Wycieczka_1", "Karaiby na 100");
		TripManager.addTrip(tr1);

		assertEquals("Trip found! " + "Wycieczka_1", TripManager.findTrip("Karaiby"));
		assertEquals("Nie znaleziono", TripManager.findTrip("Malediwy"));

	}

	@Test
	public void getTripsTest() {
		Trip tr1 = new Trip("Wycieczka_1", "Karaiby");
		Trip tr2 = new Trip("Wycieczka_2", "Melediwy");
		TripManager.addTrip(tr1);
		TripManager.addTrip(tr2);

		assertEquals(2, TripManager.getTrips().size());

	}
	

}