package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {
	
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
	//Click on Find leads
	driver.findElement(By.linkText("Find Leads")).click();
	
	//Click on phone tab
	
	driver.findElement(By.xpath("//span[text()='Phone']")).click();
	
	//Capture the ID of first resulting lead
	
	String text = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).getText();
	
	System.out.println(text);
	
	driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a)[1]")).click();
	
	//Click on delete button
	
	driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
	
	//Click on find leads
	
	driver.findElement(By.linkText("Find Leads")).click();
	
	//Enter data in leadID field
	
	driver.findElement(By.xpath("//input[@id='ext-gen246']")).sendKeys(text);
	
	//Click on findleads
	
	driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
	
	
	driver.findElement(By.xpath("//div[text()='No records to display']"));
	
	driver.close();
		

}
}