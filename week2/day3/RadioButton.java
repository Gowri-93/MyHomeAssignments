package week2.day3;

public class RadioButton extends Button{

	public void selectRadioButton() {
		System.out.println("Select the displayed RadioButton");

	}
	public static void main(String[] args) {
		RadioButton Radioobj=new RadioButton();
		Radioobj.selectRadioButton();
        Radioobj.submit();
	}

}
