package week2.day3;

public class Button extends WebElement {
	public void submit() {
		
     System.out.println("Submit button is displayed");
	}

	public static void main(String[] args) {
		Button Buttonobj=new Button();
		Buttonobj.submit();
		Buttonobj.click();

	}

}
