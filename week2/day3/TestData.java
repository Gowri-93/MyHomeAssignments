package week2.day3;

public class TestData {
	
	public void enterCredentials()
	{
       System.out.println("Credentials entered");
	}
	
	public void navigateToHomepage() {
		System.out.println("Page navigated to homepage");

	}

	public static void main(String[] args) {
		TestData value=new TestData();
		value.enterCredentials();
		value.navigateToHomepage();
	}

}
