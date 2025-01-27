package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		
		//Launch chrome browser
		
		ChromeDriver driver=new ChromeDriver();
		
		//Launch edge browser
		
		//EdgeDriver driver=new EdgeDriver();
		
		//Load URL
		
		driver.get("http://leaftaps.com/opentaps/control/main");
		
		//Maximize browser
		
		driver.manage().window().maximize();
		
		//Enter user name
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		
		//Enter Password'
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		
		//Click login button
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on crmsfa button
		
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on leads
		
		driver.findElement(By.linkText("Leads")).click();
		
		
		//click on create leads
		
		driver.findElement(By.linkText("Create Lead")).click();
	}

}
