package week2.day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class LowestPriceMobilePhones {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		//ChromeDriver driver=new ChromeDriver();
		
		EdgeDriver driver=new EdgeDriver();
				
		driver.get("https://www.amazon.in/");
		
		driver.manage().window().maximize();
		
		//driver.findElement(By.id("cookie_action_close_header")).click();
		
		//Thread.sleep(3000);
		
		//To Search Phones
		
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Phones");

		 
		//To click Search
		
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		//Get Price of the phone with locater
		
		List<WebElement> PhonePrice = driver.findElements(By.xpath("//span[@class='a-price-whole']"));
		
		int sizeofthelist = PhonePrice.size();
		
		System.out.println(sizeofthelist);
		//Declare the array list to print the price
		ArrayList<Integer> ToFindPrice=new ArrayList<Integer>();
		
		
		for (int i=0;i<=sizeofthelist-1;i++)
		{
			 String Price = PhonePrice.get(i).getText();
			 String PriceList=Price.replace(",","");
			 int WholePrice=Integer.parseInt(PriceList);
			 ToFindPrice.add(WholePrice);
			 
	
			
		}
		System.out.println("Display the Price of phones " +ToFindPrice);
		Collections.sort(ToFindPrice);
		System.out.println("Display the Lowest  Price of phones " +ToFindPrice.get(0));
		driver.close();
	}  

}
