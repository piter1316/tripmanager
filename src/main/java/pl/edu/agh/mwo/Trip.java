package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

public class Trip {
	private static String name;
	private static String description;
	public Collection<Photo> getPhotos = new ArrayList<Photo>();
	
	public Trip(String name, String description) {
		Trip.name = name;
		Trip.description = description;
		
	} 

	public void addPhoto(Photo photo) {
		getPhotos.add(photo);
		
	}

	public Photo getPhotos() {
		return getPhotos() ;
	}

	public static String getName() {
		return name;
	}

	public static void setName(String name) {
		Trip.name = name;
	}

	public static String getDescription() {
		return description;
	}

	public static void setDescription(String description) {
		Trip.description = description;
	}
	

}