package selpro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\HP\\Downloads\\Selenium\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		
		d.manage().window().maximize();
		d.get("https://letcode.in/frame");
		
		
		// switching to frame1 which contains First name and last name field
		WebElement ele= d.findElement(By.id("firstFr"));
		
		d.switchTo().frame(ele);
		
		d.findElement(By.name("fname")).sendKeys("Monika");
		d.findElement(By.name("lname")).sendKeys("Shinde");
		
		
		// switching to frame2 which contains email field
		WebElement ele1 = d.findElement(By.xpath("/html/body/app-root/app-frame-content/div/div/div/iframe"));
		
		d.switchTo().frame(ele1);
		
		d.findElement(By.name("email")).sendKeys("ae3999@gmail.com");
		
		// Now we need to go back to the default window
		d.switchTo().defaultContent();
		
		d.findElement(By.id("testing")).click();
	
	}
	

}


