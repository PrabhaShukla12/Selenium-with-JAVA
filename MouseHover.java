package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://www.ebay.com/");
		
		WebElement ele= d.findElement(By.linkText("Electronics"));
		
		Actions a= new Actions(d);
		
		// We have a method available in actions through which we can hover mouse to any webelement 
		a.moveToElement(ele).build().perform();
		
		Thread.sleep(2000);
		
		d.findElement(By.linkText("Smart watches")).click();
	}

}
