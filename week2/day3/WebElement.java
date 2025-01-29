package week2.day3;

public class WebElement {
	public void click() {
		System.out.println("Click the button displayed");

	}
	public void setText(String a) {
		System.out.println( "Test given: " +a);
	}

	public static void main(String[] args) {
		WebElement Elementobj=new WebElement();
		Elementobj.click();
		Elementobj.setText("TestLeaf");

	}

}
