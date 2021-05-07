package tddpassword.start;

public class User {

	String rank;
	String password;
	
	User(String r){
		rank=r;
	}
	
	public void setPassword(String pass) {
		System.out.println("password setting : ");
		if (Password.testvalid(pass)) {
			System.out.println("good");
			password=pass;
		}
		else System.out.println("bad");
		
	}
	
	public String getPassword() {
		return password;
	}

	public boolean isAdmin() {
		
		return rank.equals("admin");
	}
	
}
