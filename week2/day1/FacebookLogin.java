package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class FacebookLogin {

	public static void main(String[] args) {

		// Launch chrome browser

		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		// Load Facebook URL

		driver.get("https://www.facebook.com/");

		// Enter email id

		driver.findElement(By.id("email")).sendKeys("testleaf.2023@gmail.com");

		// Enter Password

		driver.findElement(By.id("pass")).sendKeys("Tuna@321");

		// Click Login

		driver.findElement(By.name("login")).click();

		// Click on Find your account and log in.

		driver.findElement(By.linkText("Find your account and log in.")).click();

		// get title of webpage

		String Text = driver.getTitle();

		System.out.println(Text);

		driver.close();

	}

}
