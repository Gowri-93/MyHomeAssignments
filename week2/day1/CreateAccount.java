package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateAccount {

	public static void main(String[] args) {
		// Launch chrome browser

		ChromeDriver driver = new ChromeDriver();

		// Load URL

		driver.get("http://leaftaps.com/opentaps/control/main");

		// Maximize browser

		driver.manage().window().maximize();

		// Enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// Enter Password'
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// Click login button
		driver.findElement(By.className("decorativeSubmit")).click();

		// Click on crmsfa button

		driver.findElement(By.linkText("CRM/SFA")).click();

		// Click on Accounts button

		driver.findElement(By.linkText("Accounts")).click();

		// click on create account

		driver.findElement(By.linkText("Create Account")).click();

		// Enter an account name

		driver.findElement(By.id("accountName")).sendKeys("Testleaf2jan2025");
		// Enter description

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Enter number of employees

		driver.findElement(By.id("numberEmployees")).sendKeys("5");

		// Enter Site name

		driver.findElement(By.name("officeSiteName")).sendKeys("LeafTaps");

		// Click Create account

		driver.findElement(By.className("smallSubmit")).click();

		// get title of webpage
		String Text = driver.getTitle();

		System.out.println(Text);

		driver.close();

	}

}
