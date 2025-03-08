package week3.day1;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) {
		// Launch chrome browser

		ChromeDriver driver = new ChromeDriver();

		// Load URL

		driver.get(" https://leafground.com/alert.xhtml");

		// Maximize browser

		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Click the show button 
		
		driver.findElement(By.xpath("(//span[text()='Show'])[5]")).click();
		
		//Transfer driver focus to alert
		
		Alert Promptalert = driver.switchTo().alert();
		
		Promptalert.sendKeys("Gowri");
					
		String textinalertbox =Promptalert.getText();
		
		System.out.println(textinalertbox);
						
		Promptalert.dismiss();
		
		String text1 = driver.findElement(By.id("confirm_result")).getText();

		System.out.println(text1);
		
		//Verify the message entered in the box
		
		if (text1.contains(textinalertbox))
			
		{
			System.out.println("Value entered in the alert box:" +textinalertbox);
		}
		
		else
			System.out.println("Message is disaplayed as: " +text1);
		
		}
		
}

