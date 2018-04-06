package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import java.io.File;

import org.junit.Test;

public class TripTest {

	@Test
	public void addPhotoTest() {
		Trip tr1 = new Trip();
		Photo photo = new Photo("Nowa fotka");
		assertEquals(0, tr1.getPhotos.size());
		tr1.addPhoto(photo);
		assertEquals(1, tr1.getPhotos.size());
		
		
		
	}
	@Test
	public void getPhotosTest() {
		Trip tr1 = new Trip();
		Photo photo = new Photo("Nowa fotka");
		
		
	}

}