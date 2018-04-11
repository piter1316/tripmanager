package pl.edu.agh.mwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PhotoTest {
	
	@Test
	 
	public void getCommentTest() {
		
		Photo p1 = new Photo("Nowa fotka");
		
		assertEquals("Nowa fotka",Photo.getComment()); 
	}
	@Test
	public void setCommentTest() {
		Photo p1 = new Photo("Nowa fotka");
		p1.setComment("FOCIA");
		String comm = Photo.getComment();
		assertEquals("FOCIA",comm);
	} 

}
