package tddpassword.start;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TestUser {

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
