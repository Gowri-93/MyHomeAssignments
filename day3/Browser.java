package week1.day3;

public class Browser {

	public static void main(String[] args) {
		Browser browserobj=new Browser();
		System.out.println(browserobj.launchBrowser());
		browserobj.loadUrl();

		
	}
public String launchBrowser() {
	return "Chrome";

}
public void loadUrl() {
	System.out.println("Loading URl");

}


}
