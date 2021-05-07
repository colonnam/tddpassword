package tddpassword.start;


public class Password {

	public static boolean testsize(String pass) {
		return pass.length()>=6;
	}

	public static boolean testletter(String pass) {
		for (char c: pass.toCharArray()) {
			if (Character.isLetter(c))
				return true;
		}
		return false;
	}

	public static boolean testnumber(String pass) {
		for (char c: pass.toCharArray()) {
			if (Character.isDigit(c))
				return true;
		}
		return false;
	}

	public static boolean testvalid(String goodpass) {
	
		return testsize(goodpass)&&testnumber(goodpass)&&testletter(goodpass);
	}

	public static boolean testSizeAdmin(String pass) {
		return pass.length()>=10;
		
	}

	public static boolean isSpecial(String specialpass) {

		for(char ch:specialpass.toCharArray())
			if(!Character.isDigit(ch) && !Character.isLetter(ch))
				return true;
		return false;
	}

	public static boolean adminvalid(String adminpass) {
		

		return testSizeAdmin(adminpass)&&testnumber(adminpass)&&testletter(adminpass)&&isSpecial(adminpass);
	}
	
	

	


}
