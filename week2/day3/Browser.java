package week2.day3;

public class Browser {

	public void openURL()
	{
		System.out.println("URL loaded");
		
	}
	
	public void closeBrowse() {
		System.out.println("Browser closed");

	}
	public void navigateBack() {
		
		System.out.println("Navigated back");

	}
	public static void main(String[] args) {
		Browser browserfunctions= new Browser();
		browserfunctions.openURL();
		browserfunctions.closeBrowse();
		browserfunctions.navigateBack();

	}

}
