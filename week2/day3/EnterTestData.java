package week2.day3;

public class EnterTestData extends TestData{

	public void enterUsername() {
		System.out.println("Username entered");

	}
	
	public void enterPassword() {
	 System.out.println("Pasword entered");

	}
	public static void main(String[] args) {
		EnterTestData Testvalues=new EnterTestData();
		
		Testvalues.enterUsername();
		Testvalues.enterPassword();
		Testvalues.enterCredentials();
		Testvalues.navigateToHomepage();
		

	}

}
