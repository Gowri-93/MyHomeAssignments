package week2.day3;

public class CheckBoxButton extends Button{
	public void clickCheckBoxButton() {
		System.out.println("Click on the Checkboxbutton");
	}

	public static void main(String[] args) {
		CheckBoxButton checkobj=new CheckBoxButton();
		checkobj.clickCheckBoxButton();
		checkobj.submit();
		

	}

}
