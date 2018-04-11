package pl.edu.agh.mwo;

import java.util.ArrayList;
import java.util.Collection;

import javax.xml.stream.events.Comment;

public class Photo {

	
	private static String comment; 

	public Photo(String comment) {
		this.setComment(comment);
	} 
  static String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}
	
	

}
