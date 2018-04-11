package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class TripTest {

	@Test
	public void addPhotoTest() {
		Trip tr1 = new Trip();
		Photo photo = new Photo("Nowa Fotka");
		assertEquals(0, Trip.getPhotos.size());
		tr1.addPhoto(photo);
		assertEquals(1, Trip.getPhotos.size());

	}

	@Test
	public void getPhotosTest() {
		Trip tr1 = new Trip();
		Photo photo = new Photo("Nowa Fotka");
		assertEquals(1, Trip.getPhotos.size());

	}

	@Test
	public void getNameTest() {
		Trip tr1 = new Trip();
		tr1.setName("Wycieczka_1");

		assertEquals("Wycieczka_1", Trip.getName());
	} 

	@Test
	public void setNameTest() {

		Trip tr1 = new Trip();
		tr1.setName("Nowa Wycieczka");
		assertEquals("Nowa Wycieczka", Trip.getName());
	}

	@Test
	public void setDrescriptionTest() {

		Trip tr1 = new Trip();
		tr1.setDescription("Karaiby !!!");
		String desc = Trip.getDescription();
		assertEquals("Karaiby !!!", desc);
	}

	@Test
	public void getDescriptionTest() {
		Trip tr1 = new Trip();
		tr1.setDescription("KARAIBY!!!");

		assertEquals("KARAIBY!!!", tr1.getDescription());

	}

}