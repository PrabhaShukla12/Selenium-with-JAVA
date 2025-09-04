package selpro;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		
		// navigate to the URL
		d.get("https://letcode.in/waits");
		
		d.findElement(By.id("accept")).click();
		
		// Script for Explicit wait - It waits until the expected condition is fulfilled or the duration specified by the user
		WebDriverWait wait = new WebDriverWait(d, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.alertIsPresent());
		
		String ale= d.switchTo().alert().getText();
		
		System.out.println("Alert box says: "+ ale);
	
		Thread.sleep(1000);
		d.switchTo().alert().accept();
	}
	

}
