package tddpassword.start;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepetitionInfo;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestInfo;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

public class TestPassword {
	
	
	@BeforeAll
	public static void setup() {
		System.out.println("Starting testing password");
	}
	
	@AfterAll
	public static void payoff() {
		System.out.println("ending testing password");
	}
	
	

	@Test

	public void passwordshort() {
		String badpass="azer";
		
		boolean testbadpass= Password.testsize(badpass);

		
		Assertions.assertFalse(testbadpass);
			
	}
	@Test

	public void passwordgood() {
	
		String goodpass="azerty";
		
		boolean testgoodpass= Password.testsize(goodpass);
		
		Assertions.assertTrue(testgoodpass);
			
	}
	@Test
	
	public void testcontainletter() {
	String goodpass="azerty";
	
	boolean testgoodpass= Password.testletter(goodpass);
	
	Assertions.assertTrue(testgoodpass);
	}
	@Test

	public void testnotcontainletter() {
	String badpass="234";
	
	boolean testbadpass= Password.testletter(badpass);
	
	Assertions.assertFalse(testbadpass);
	}
	
	@Test

	public void testcontainnumber() {
	String goodpass="234";
	
	boolean testgoodpass= Password.testnumber(goodpass);
	
	Assertions.assertTrue(testgoodpass);
	}
	
	@Test
	
	public void testnotcontainnumber() {
	String badpass="azerty";
	
	boolean testbadpass= Password.testnumber(badpass);
	
	Assertions.assertFalse(testbadpass);
	}
	@Test
	public void testvalidPass() {
		String goodpass="martin2b";
		
		boolean testgoodpass= Password.testvalid(goodpass);
		
		Assertions.assertTrue(testgoodpass);
	}
	@ParameterizedTest
	@ValueSource(strings = {"martin", "m2aer","22345678"})
	public void testinvalidPass(String badpass) {
		
		boolean testbadpass= Password.testvalid(badpass);
		
		Assertions.assertFalse(testbadpass);
	}
	
	@Test
	public void testgoodadminpasslength() {
		String goodpass="qertyuirtyudfvbjk";
		
		boolean testgoodpass=Password.testSizeAdmin(goodpass);
		
		Assertions.assertTrue(testgoodpass);
		
	}
	@Test
	public void testbadadminpasslength() {
		String badpass="gfgfgfh";
		
		boolean testbadpass=Password.testSizeAdmin(badpass);
		
		Assertions.assertFalse(testbadpass);
	}
	
	@Test 
	public void testspecial() {
		String specialpass="=";
		
		boolean testspecial=Password.isSpecial(specialpass);
		
		Assertions.assertTrue(testspecial);
		
	}
	
	@Test
	public void testnospecial() {
		String badpass="gfgfgfh";
		
		boolean testbadpass=Password.isSpecial(badpass);
		
		Assertions.assertFalse(testbadpass);
	}
	
	@Test 
	public void testvalidadminpass() {
		String adminpass="thisadmin=2ok";
		
		boolean testadmin=Password.adminvalid(adminpass);
		
		Assertions.assertTrue(testadmin);
	}
	
	@ParameterizedTest
	@ValueSource(strings = {"martintytdgudg", "m2aerihfihriufhr","223456782222222","az*nfinf2"})
	public void testinvalidPassAdmin(String badpass) {
		
		boolean testbadpass= Password.adminvalid(badpass);
		
		Assertions.assertFalse(testbadpass);
	}
	
	
}
