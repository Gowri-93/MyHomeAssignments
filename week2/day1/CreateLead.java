package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class CreateLead {

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

		// Click on leads

		driver.findElement(By.linkText("Leads")).click();

		// click on create leads

		driver.findElement(By.linkText("Create Lead")).click();

		// Enter Company name

		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("TestLeaforg");

		// Enter First name

		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Laksh");

		// Enter Last name

		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("D");

		// Enter the title

		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("TestLead");

		// Click Create lead

		driver.findElement(By.className("smallSubmit")).click();

		// Get tile text
		String Titledisplayed = driver.getTitle();

		System.out.println(Titledisplayed);
		driver.close();
	}

}
