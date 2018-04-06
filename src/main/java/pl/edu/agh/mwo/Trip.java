package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	static String name;
	static String description;
	
	
	public Collection<Photo> getPhotos = new ArrayList<Photo>();

	public void addPhoto(Photo photo) {
		getPhotos.add(photo);
		
	}

	public Photo getPhotos() {
		return getPhotos() ;
	}
	public void razDwa(){
		System.out.println("abc");
	}

}