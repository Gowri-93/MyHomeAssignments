package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FacebooRegistration {

	public static void main(String[] args) throws InterruptedException {
		//Launch chrome browser
		 ChromeDriver driver = new ChromeDriver();

		// Load URL

		driver.get("https://www.facebook.com/");

		// Maximize browser

		driver.manage().window().maximize();
		
		//Wait time
		
		Thread.sleep(3000);
		
		// click create new account
		
		driver.findElement(By.linkText("Create new account")).click();
		
		//Enter Firstname
		
		driver.findElement(By.name("firstname")).sendKeys("Test");
		
		//Enter lastname
		
		driver.findElement(By.name("lastname")).sendKeys("GD");
		
		//Enter Date of birth
		//Day
		
		WebElement DayDD = driver.findElement(By.id("day"));
		
		Select DD1=new Select(DayDD);
		
		DD1.selectByValue("10");
		
        //Month
		WebElement monthDD = driver.findElement(By.id("month"));
		
		Select DD2=new Select(monthDD);
		
		DD2.selectByVisibleText("Jun");
		
		//Year
		
       WebElement yearDD = driver.findElement(By.id("year"));
		
		Select DD3=new Select(yearDD);
		
		DD3.selectByVisibleText("2018");
		
		//Select gender
		
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		//Enter Mobile number
		
		
		driver.findElement(By.name("reg_email__")).sendKeys("9874563210");
		
		
		//Enter Password
		
		driver.findElement(By.id("password_step_input")).sendKeys("testleas123");

	}

	}
