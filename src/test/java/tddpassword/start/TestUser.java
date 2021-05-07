package tddpassword.start;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class TestUser {
	static int inc=0;
	
	@BeforeAll
	public static void setup() {
		System.out.println("Starting testing user");
	}
	
	@AfterAll
	public static void payoff() {
		System.out.println("ending testing user");
	}

	@BeforeEach
	public void setupeach() {
		System.out.println("Starting testing -->"+ ++inc);
	}
	
	@AfterEach
	public void payoffeach() {
		System.out.println("finished test :"+inc);
	}
	@Test
	public void passwordset() {
		String pass="martin2b";
		User u=new User("user");
		
		u.setPassword(pass);
		
		Assertions.assertEquals(pass, u.getPassword());
	}
	@Test
	public void passwordnotset() {
		String pass="martin";
		User u=new User("user");
		
		u.setPassword(pass);
		
		Assertions.assertEquals(null, u.getPassword());
	}
	
	@Test 
	public void testisAdmin() {
		User u=new User("admin");
		
		boolean testadmin=u.isAdmin();
		
		Assertions.assertTrue(testadmin);
	}
	
}
