package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

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

		driver.findElement(By.id("accountName")).sendKeys("Testleaf9jan2025");
		// Enter description

		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");

		// Select industry

		WebElement indValue = driver.findElement(By.name("industryEnumId"));

		Select DD1 = new Select(indValue);

		DD1.selectByValue("IND_SOFTWARE");

		// Select Ownership

		WebElement ownerdropdown = driver.findElement(By.name("ownershipEnumId"));

		Select DD2 = new Select(ownerdropdown);

		DD2.selectByVisibleText("S-Corporation");

		// Select Source

		WebElement sourcedropdown = driver.findElement(By.id("dataSourceId"));

		Select DD3 = new Select(sourcedropdown);

		DD3.selectByValue("LEAD_EMPLOYEE");

		// Select marketing campaign

		WebElement Marketcampdropdown = driver.findElement(By.id("marketingCampaignId"));

		Select DD4 = new Select(Marketcampdropdown);

		DD4.selectByIndex(6);

		// Select state

		WebElement statedropdown = driver.findElement(By.id("generalStateProvinceGeoId"));

		Select DD5 = new Select(statedropdown);

		DD5.selectByValue("TX");

		// Click create account name

		driver.findElement(By.className("smallSubmit")).click();

		// Check whether the account name is displayed correctly

		WebElement element = driver.findElement(By.xpath("//span[contains(text(),'Testleaf9jan2025')]"));
		
		
		System.out.println(element.getText());

		driver.close();

	}

}
