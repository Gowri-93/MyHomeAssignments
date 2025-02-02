package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EditLead {

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
				
				//Enter Company name using Xpath
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("TestLeaf");
				
				//Enter Firstname using xpath
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstName']")).sendKeys("Ravi");
				
				//Enter lastname using xpath
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_lastName']")).sendKeys("Raj");
				
				//Enter Firstname local
				
				driver.findElement(By.xpath("//input[@id='createLeadForm_firstNameLocal']")).sendKeys("RR");
				
				//Enter Department 
				
				driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Testing");
				
				//Enter Description
				
				driver.findElement(By.id("createLeadForm_description")).sendKeys("Selenium");
				
				//Enter Email
				
				driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("abc@gmail.com");
				
				//Select State province
				
				//Tohandle dropdown-Find element,select class,followed by Select method
				
				WebElement State = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
				
				Select Stateopt=new Select(State);
				
				Stateopt.selectByValue("NY");
				
				// Click Create lead

				driver.findElement(By.name("submitButton")).click();
				
				//click on Edit
				
				driver.findElement(By.linkText("Edit")).click();
				
				//Edit description field
				
				driver.findElement(By.id("updateLeadForm_description")).clear();
				
				//Enter Important note
				
				driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("New note");
				
				//click on update
				
				driver.findElement(By.xpath("//input[@name='submitButton']")).click();
				
				//displayed the title of the page
				
				String PageTitle = driver.getTitle();
				
				System.out.println(PageTitle);
				
				driver.close();
				
				

	}

}
