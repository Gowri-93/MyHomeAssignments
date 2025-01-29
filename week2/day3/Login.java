package week2.day3;

public class Login extends EnterTestData{
	public void clickLogin()
	{
		System.out.println("Login to the application sucessfully");
	}

	public static void main(String[] args) {
		Login logobj=new Login();
		logobj.clickLogin();
		logobj.enterCredentials();
		logobj.navigateToHomepage();
		logobj.enterUsername();
		logobj.enterPassword();
		
		
				
	}

}
