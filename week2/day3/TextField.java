package week2.day3;

public class TextField extends WebElement {

	public void getText() {
		System.out.println("Text dispalyed");

	}
	public static void main(String[] args) {
		TextField Textobj=new TextField();
		Textobj.getText();
		Textobj.setText("TestLeaf");

	}

}
