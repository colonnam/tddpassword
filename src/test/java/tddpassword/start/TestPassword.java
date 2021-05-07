package tddpassword.start;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

public class TestPassword {

	@Test
	@Disabled
	public void passwordshort() {
		String badpass="azer";
		
		boolean testbadpass= Password.testsize(badpass);

		
		Assertions.assertFalse(testbadpass);
			
	}
	@Test
	@Disabled
	public void passwordgood() {
	
		String goodpass="azerty";
		
		boolean testgoodpass= Password.testsize(goodpass);
		
		Assertions.assertTrue(testgoodpass);
			
	}
	@Test
	@Disabled
	public void testcontainletter() {
	String goodpass="azerty";
	
	boolean testgoodpass= Password.testletter(goodpass);
	
	Assertions.assertTrue(testgoodpass);
	}
	@Test
	@Disabled
	public void testnotcontainletter() {
	String badpass="234";
	
	boolean testbadpass= Password.testletter(badpass);
	
	Assertions.assertFalse(testbadpass);
	}
	
	@Test
	@Disabled
	public void testcontainnumber() {
	String goodpass="234";
	
	boolean testgoodpass= Password.testnumber(goodpass);
	
	Assertions.assertTrue(testgoodpass);
	}
	
	@Test
	@Disabled
	public void testnotcontainnumber() {
	String badpass="azerty";
	
	boolean testbadpass= Password.testnumber(badpass);
	
	Assertions.assertFalse(testbadpass);
	}
	@Test
	public void ValidPass() {
		String goodpass="martin2b";
		
		boolean testgoodpass= Password.testvalid(goodpass);
		
		Assertions.assertTrue(testgoodpass);
	}
	
	
}
